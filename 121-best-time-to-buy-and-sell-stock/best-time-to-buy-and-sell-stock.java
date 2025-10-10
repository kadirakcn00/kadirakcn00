class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];      
        int maxProfit = 0;         
        int buyindex = 0;         
        int buy = 0;
        int sell = 0 ;            

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                buyindex = i;
            } else {
                int profit = prices[i] - min;
                if (profit > maxProfit) {
                    maxProfit = profit;
                    buy = min;
                    sell = prices[i];
                }
            }
        }

        return maxProfit > 0 ? maxProfit : 0;
    }
}
