class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length == 1) return 1;
        // a array with more than one element has at least two wiggles
        int count = 1;
        int prev_diff = 0;
        for (int i=1; i<nums.length; i++) {
            int curr_diff = nums[i] - nums[i-1];
            if (nums[i] != nums[i-1] && curr_diff * prev_diff <= 0) {
                count += 1;
                prev_diff = curr_diff;
            } else continue;
        }
        return count;
    }
}