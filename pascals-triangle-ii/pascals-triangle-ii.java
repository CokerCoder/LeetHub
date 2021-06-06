class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> nums = new ArrayList<Integer>();
        
        // base case
        nums.add(1);
        if (rowIndex == 0)
            return nums;
        
        for (int i=0; i<rowIndex; i++) {
            List<Integer> curr = new ArrayList<Integer>();
            curr.add(1);
            for (int j=1; j<nums.size(); j++) {
                curr.add(nums.get(j)+nums.get(j-1));
            }
            curr.add(1);
            nums = curr;
        }
        
        return nums;
    }
}