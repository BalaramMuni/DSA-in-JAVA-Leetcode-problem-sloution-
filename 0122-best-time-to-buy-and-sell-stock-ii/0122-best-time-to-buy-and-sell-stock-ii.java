class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i-1] < prices[i]){
                //calculate profit of a single day
                int profit = prices[i] - prices[i-1];

                maxprofit = maxprofit + profit;
            }
        }
        return maxprofit;
    }
}