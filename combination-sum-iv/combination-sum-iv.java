class Solution {
    public int combinationSum4(int[] nums, int target) {
        
        int[] dp = new int[target+1];
        
        int min = Arrays.stream(nums)
                        .min()
                        .getAsInt();
        if (min > target) return 0;
        dp[0] = 1; // add itself
        dp[min] = 1;
        
        for (int i=min+1; i<=target; i++) {
            for (int j=0; j<nums.length; j++) {
                if (i - nums[j] >= 0) dp[i] += dp[i - nums[j]];
            }
        }
        
        return dp[target];
    }
}