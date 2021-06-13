class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        int[] dp = new int[n];
        int prev_max = 0;
        int curr_max = 0;
        
        for (int i=0; i<n; i++) {
            
            int curr = 0;
            if (i <= 1) curr = nums[i];
            if (i > 1) curr = nums[i] + prev_max;
            
            dp[i] = curr;
            int tmp = curr_max;
            curr_max = curr;
            if (tmp > prev_max)
                prev_max = tmp;
            
        }
        
        return Math.max(prev_max, curr_max);
    }
}