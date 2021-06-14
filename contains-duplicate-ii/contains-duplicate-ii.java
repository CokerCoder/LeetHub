class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++) {
            // If the map previously contained a mapping for the key, the old value is replaced by the specified value.
            Integer ord = map.put(nums[i], i);
            if (ord != null && i - ord <= k) return true;
        }
        return false;
    }
}