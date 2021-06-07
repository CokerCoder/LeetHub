class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        int[] cheapest_stocks = new int[n];
        int cheapest_stock = prices[0];
        int max_profit = 0;
        
        for (int i=0; i<n; i++) {
            if (prices[i] < cheapest_stock) {
                cheapest_stock = prices[i];
            }
            cheapest_stocks[i] = cheapest_stock;
            
            int profit = prices[i] - cheapest_stock;
            if (profit > max_profit)
                max_profit = profit;   
        }

        return max_profit;
    }
}