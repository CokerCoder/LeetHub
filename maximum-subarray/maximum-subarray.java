class Solution {
    public int maxSubArray(int[] nums) {
        
        // dynamic programming
        int len = nums.length;
        int global_maxi = nums[0], local_maxi = nums[0];

        // calculate the sums of subarrays ending at position i
        for (int i=1; i<len; i++) {
            // local_maxi[i] = max(nums[i], local_maxi[i-1])
            int next = Math.max(nums[i], nums[i]+local_maxi);
            if (next > global_maxi)
                global_maxi = next;
            local_maxi = next;
        }
        
        return global_maxi;
    }
}