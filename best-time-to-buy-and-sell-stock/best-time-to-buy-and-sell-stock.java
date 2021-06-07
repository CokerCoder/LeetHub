class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        int[] cheapest_stocks = new int[n];
        int cheapest_stock = prices[0];
        for (int i=0; i<n; i++) {
            if (prices[i] < cheapest_stock) {
                cheapest_stock = prices[i];
            }
            cheapest_stocks[i] = cheapest_stock;
        }
        
        int max_profit = 0;
        for (int j=0; j<n; j++) {
            if (prices[j] - cheapest_stocks[j] > max_profit)
                max_profit = prices[j] - cheapest_stocks[j];
        }
        
        return max_profit;
    }
}