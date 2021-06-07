class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] sums = new int[n];
        sums[0] = nums[0];
        for (int i=1; i<n; i++) {
            sums[i] = nums[i] + sums[i-1];
        }
        return sums;
    }
}