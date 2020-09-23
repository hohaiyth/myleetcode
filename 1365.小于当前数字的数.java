class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int []res = new int[len];
     for(int i =0;i<nums.length;i++){
         for(int j =0;j<nums.length;j++){
             if(nums[i]>nums[j])
              res[i]++;
         }
         
     }
     return res;
    }
}
