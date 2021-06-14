class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(nums[i]))
                return true;
            map.put(nums[i], true);
        }
        return false;
    }
}