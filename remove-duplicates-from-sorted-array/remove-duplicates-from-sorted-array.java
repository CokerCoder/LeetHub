import java.util.ArrayList;

class Solution {
    public static int removeDuplicates(int[] nums) {
        // arraylist to store the presented number
        List<Integer> num_list = new ArrayList<Integer>();
        int i;
        for (i = 0; i < nums.length; i++) {
            // if present
            if (num_list.contains(nums[i])) {
                if (nums[i] == nums[nums.length - 1])
                    return i;
                // shift one place right from current position
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                i -= 1;
            } else
                num_list.add(nums[i]);
        }
        return i;
    }
}