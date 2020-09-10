class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null ||prices.length == 0){
            return 0;
        }
        int price = 0;
        int temp = prices[0];
        for(int i =1;i<prices.length;i++){
            if(temp<prices[i]){
                price += (prices[i]-temp);
             }
             temp = prices[i];
        }
        return price;
    }
}
