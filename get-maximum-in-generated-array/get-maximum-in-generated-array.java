class Solution {
    public int getMaximumGenerated(int n) {
        if (n<=1) return n;
        int maxi = 1;
        int[] dp = new int[n+1];
        dp[0] = 0; dp[1] = 1;
        for (int i=1; 2*i<=n; i++) {
            dp[2*i] = dp[i];
            if (2*i+1<=n) {
                dp[2*i+1] = dp[i] + dp[i+1];
                if (dp[2*i+1]>maxi) maxi = dp[2*i+1];
            }
        }
        System.out.println(Arrays.toString(dp));
        return maxi;
    }
}