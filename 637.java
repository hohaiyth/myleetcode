/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //採用廣度優先搜索算法，使用隊列來進行輔助
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
      List<Double> averages = new ArrayList<Double>();
      Queue<TreeNode> queue = new LinkedList<TreeNode>(); //隊列的定義
      queue.offer(root);                                 //將root入隊列
      while(!queue.isEmpty()){
          double sum =0;
          int size =queue.size();
          for(int i=0;i<size;i++){
           TreeNode node = queue.poll();        //結點出對列
           sum +=node.val;
           TreeNode left = node.left, right = node.right;
           if(left !=null){
               queue.offer(left);
           }
           if(right !=null){
               queue.offer(right);
           }
          
       
          }
          averages.add(sum/size);
      }
      return averages;
    }
}

