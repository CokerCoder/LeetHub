class Solution {
    public int change(int amount, int[] coins) {
        
        int[] dp = new int[amount+1];
        // dp[i] = the number of combinations that make up i
        
        dp[0] = 1;
        
        // my previous wrong solution
        // if use coin as inner loop, an amount will be added twice
        // for (int i=1; i<=amount; i++) {
        //     for (int j=0; j<coins.length; j++) {
        //         if (i-coins[j] > 0) {
        //             if (dp[i-coins[j]] > 0)
        //                 dp[i] += dp[i-coins[j]];
        //         }
        //     }
        // }
        
        for (int i=0; i<coins.length; i++) {
            for (int j=1; j<=amount; j++) {
                if(j-coins[i]>=0)
                    dp[j] += dp[j-coins[i]];
            }
        }
        
        System.out.println(Arrays.toString(dp));
        return dp[amount];
    }
}