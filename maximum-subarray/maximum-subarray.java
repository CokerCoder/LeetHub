class Solution {
    public int maxSubArray(int[] nums) {
        
        // dynamic programming
        int len = nums.length;
        // local_maxi[x] is the local maximum of the subarrays starting at position x
        int[] local_maxi = new int[len];
        
        int global_maxi = nums[0];
        
        local_maxi[0] = nums[0];
        
        // calculate the sums of subarrays ending at position i
        for (int i=1; i<len; i++) {
            // local_maxi[i] = max(nums[i], local_maxi[i-1])
            int next = Math.max(nums[i], nums[i]+local_maxi[i-1]);
            if (next > global_maxi)
                global_maxi = next;
            local_maxi[i] = next;
        }
        
        return global_maxi;
    }
}