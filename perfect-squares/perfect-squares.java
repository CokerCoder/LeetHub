class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        // fill perfect squares
        for (int i=1; i*i<=n; i++) {
            dp[i*i] = 1;
        }
        // dp[i] = the minimum number of perfect square numbers that sum to i
        for (int i=1; i<=n; i++) {
            if (dp[i] == 1) continue;
            int curr_min = n;
            for (int j=1; j<i; j++) {
                if (dp[j] + dp[i-j] < curr_min) 
                    curr_min = dp[j] + dp[i-j];
            }
            dp[i] = curr_min;
        }
        // System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}