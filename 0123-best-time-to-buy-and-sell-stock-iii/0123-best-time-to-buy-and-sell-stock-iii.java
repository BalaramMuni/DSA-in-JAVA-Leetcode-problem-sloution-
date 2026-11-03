class Solution {
    public int maxProfit(int[] prices) {
        int b1 = -prices[0];
        int b2 = -prices[0];
        int s1 = 0;
        int s2 = 0;
        for (int i = 1; i < prices.length; i++) {
            int p = prices[i];
            //buy stock 
            b1 = Math.max(b1, -p);
            //sell stock1 (stock price + current price add becuz we put negative sign)
            s1 = Math.max(s1, b1 + p);

            //buy stock 2 (profit - buy price)
            b2 = Math.max(b2, s1 - p);

            //sell stock2 current buying price + current price
            s2 = Math.max(s2, b2 + p);

        }
        return s2;

    }
}