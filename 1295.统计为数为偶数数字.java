class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
     for(int i =0;i<nums.length;i++){
         int N =nums[i];
         int res =0;
         while(N!=0){
         N/=10;
         res+=1;
         }
        if(res%2 == 0){
            count+=1;
        }
     }
     
    return count;
    }
}
