class Solution {
    public int minCount(int[] coins) {
     int etc =0;
    for(int i=0;i<coins.length;i++){
        if(coins[i]%2==0){
        etc +=coins[i]/2;
        }
        else
        etc +=coins[i]/2+1;
    }
    return etc;
    }
}
