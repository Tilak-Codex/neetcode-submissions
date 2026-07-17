class Solution {
    public int maxProfit(int[] prices) {
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i = 0; i < prices.length; i++) {
            buy_price = Math.min(buy_price, prices[i]);
            max_profit = Math.max(max_profit, prices[i] - buy_price);
        }

        return max_profit;
    }
}