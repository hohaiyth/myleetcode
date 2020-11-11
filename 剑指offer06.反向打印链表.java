/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
class Solution {
    public int[] reversePrint(ListNode head) {
    Stack<ListNode>stack = new Stack<ListNode>();
    ListNode t = head;
    while(t!=null){
     stack.push(t);
     t = t.next;
    }
    int size = stack.size();
    int print[] =new int[size];
    for(int i =0;i<size;i++){
     print[i] = stack.pop().val;
    }
    return print;
    }
}
