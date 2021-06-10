class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> rows = new ArrayList<List<Integer>>();
        List<Integer> first_row = new ArrayList<Integer>();
        first_row.add(triangle.get(0).get(0));
        rows.add(first_row);

        for (int i=1; i<triangle.size(); i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j=0; j<triangle.get(i).size(); j++) {
                if (j==0) {
                    row.add(triangle.get(i).get(j) + rows.get(i-1).get(0));
                }
                else if (j==triangle.get(i).size()-1) {
                    row.add(triangle.get(i).get(j) + rows.get(i-1).get(j-1));
                }
                else {
                    row.add(Math.min(triangle.get(i).get(j) + rows.get(i-1).get(j-1),
                                     triangle.get(i).get(j) + rows.get(i-1).get(j)));
                }
            }
            rows.add(row);
        }
        
        // get the minimum of last row
        return Collections.min(rows.get(rows.size()-1));
    }
}