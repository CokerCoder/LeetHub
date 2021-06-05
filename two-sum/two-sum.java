class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        Map<Integer, Integer> num_map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            num_map.put(nums[i], i);
        }
        for (int j=0; j<nums.length; j++) {
            int diff = target - nums[j];
            if (num_map.containsKey(diff) && (num_map.get(diff)!=j)) {
                indices[0] = j;
                indices[1] = num_map.get(diff);
                break;
            }
        }
        return indices;
    }
}