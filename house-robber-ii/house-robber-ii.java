class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        int[] dp = new int[n];
        int prev_max = 0;
        int curr_max = 0;
        
        // start from 1 first as we want to know the maximum without robbing the first house
        for (int i=1; i<n-2; i++) {
            
            int curr = 0;
            if (i <= 1) curr = nums[i];
            if (i > 1) curr = nums[i] + prev_max;
            
            dp[i] = curr;
            int tmp = curr_max;
            curr_max = curr;
            if (tmp > prev_max)
                prev_max = tmp;
            
        }
        System.out.println(Arrays.toString(dp));
        
        int max_without_first = Math.max(prev_max, curr_max);
        
        prev_max = 0;
        curr_max = 0;
        
        for (int i=0; i<n-1; i++) {
            
            int curr = 0;
            if (i <= 1) curr = nums[i];
            if (i > 1) curr = nums[i] + prev_max;
            
            dp[i] = curr;
            int tmp = curr_max;
            curr_max = curr;
            if (tmp > prev_max)
                prev_max = tmp;
            
        }
        if (n != 3) dp[n-1] = nums[n-1] + max_without_first;
        
        System.out.println(Arrays.toString(dp));
        
        return Math.max(Math.max(prev_max, curr_max), dp[n-1]);
    }
}