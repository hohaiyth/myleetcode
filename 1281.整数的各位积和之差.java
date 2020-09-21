class Solution {
    public int subtractProductAndSum(int n) {
        int s1 =0;
        int s2 =1;
        int i =0;
        while(n>0){
      i = n%10;
      n = n/10;
      s1 +=i;
      s2 *=i;
     
        }
     return s2-s1;

    }
}
