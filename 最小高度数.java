/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
      return helpers(nums,0,nums.length-1);
    }
    public TreeNode helpers(int[] nums,int low,int high) {
     if(low>high)
     return null;

     int mid = (high-low)/2+low;
     TreeNode root = new TreeNode(nums[mid]);
     root.left = helpers(nums,low,mid-1);
     root.right = helpers(nums,mid+1,high);
     return root;
    }
}
