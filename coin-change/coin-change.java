class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int[] dp = new int[amount+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        
        for (int i=0; i<coins.length; i++) {
            if (coins[i] <= amount) dp[coins[i]] = 1;
        }
        
        // dp[i] = the fesest number of coins to make up i
        
        for (int i=1; i<=amount; i++) {
            // original answer time exceed
            // for (int j=1; j<i; j++) {
            //     int diff = Math.min(dp[i], dp[i-j] + dp[j]);
            //     if (diff > 0)
            //         dp[i] = diff;
            // }
            for (int j=0; j<coins.length; j++) {
                if (i-coins[j] > 0) {
                    int diff = Math.min(dp[i], dp[i-coins[j]] + 1);
                    if (diff > 0) dp[i] = diff;
                }
                
            }
        }
        
        // System.out.println(Arrays.toString(dp));
        
        if (dp[amount] == Integer.MAX_VALUE) return -1;
        return dp[amount];
    }
}