class Solution {
    public int maxProduct(int[] nums) {
        int big = 0,small =0;
        for (int n:nums){
            if(n>big){
                int tmp = big;
                big = n;
                small = tmp;
            }
            else {
                small = Math.max(n,small);
            }
        }
        return (small-1)*(big-1);
    }
}
