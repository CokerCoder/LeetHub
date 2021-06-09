class Solution {
    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        // in-place
        // update first row and first column
        for (int i=1; i<rows; i++) 
            grid[i][0] = grid[i][0] + grid[i-1][0];
        for (int j=1; j<cols; j++)
            grid[0][j] = grid[0][j] + grid[0][j-1];
        
        for (int row=1; row<rows; row++) 
            for (int col=1; col<cols; col++) 
                grid[row][col] = Math.min(grid[row][col]+grid[row-1][col], grid[row][col]+grid[row][col-1]);
        
        return grid[rows-1][cols-1];
    }
}