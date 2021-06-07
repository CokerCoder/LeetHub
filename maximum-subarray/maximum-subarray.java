class Solution {
    public int maxSubArray(int[] nums) {
        // brute-force
        int maxi = Integer.MIN_VALUE;
        for (int i=0; i<nums.length; i++) {
            int curr = 0;
            for (int j=i; j<nums.length; j++) {
                curr += nums[j];
                if (curr > maxi)
                    maxi = curr;
            }
        }
        
        return maxi;
    }
}