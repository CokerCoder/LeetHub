class Solution {
    public int searchInsert(int[] nums, int target) {
        // binary search
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int half = low + (high - low) / 2;
            if (nums[half] == target)
                return half;
            else if (nums[half] < target) {
                low = half + 1;
            } else if (nums[half] > target) {
                high = half - 1;
            }
        }
        return low;
    }
}