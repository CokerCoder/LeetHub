class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        
        // Memory Limit Exceed
//         int[][] dp = new int[n][n];
        
//         int maxi = nums[0];
//         for (int i=0; i<n; i++) {
//             for (int j=i; j<n; j++) {
//                 if (i==j) {
//                     dp[i][j] = nums[i];
//                 } else
//                     dp[i][j] = dp[i][j-1] * nums[j];
//                 if (dp[i][j] > maxi) maxi = dp[i][j];
//             }
//         }
        
        int[] dp = new int[n];
        
        int maxi = nums[0];
        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                if (i==j) {
                    dp[i] = nums[i];
                } else {
                    dp[i] = dp[i] * nums[j];
                }
                if (dp[i] > maxi) maxi = dp[i];
            }
        }
        
        return maxi;
    }
}