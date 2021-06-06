class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> nums = new ArrayList<List<Integer>>();
        
        List<Integer> row = new ArrayList<Integer>();
        row.add(1);
        nums.add(row);
        
        // base case
        if (numRows == 1)
            return nums;
        
        for (int i=1; i<numRows; i++) {
            
            // get the previous row
            List<Integer> prev = nums.get(nums.size()-1);
            
            row = new ArrayList<Integer>();
            // first and tail one
            row.add(1);
            row.add(1);
            
            // iterate prev row to calculate the current one
            // starting from index 1
            for (int j=1; j<prev.size(); j++) {
                row.add(1, prev.get(j-1)+prev.get(j));
            }
            nums.add(row);
            
        }
        
        return nums;
    }
}