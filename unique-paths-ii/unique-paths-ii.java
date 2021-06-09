class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[rows-1].length;
        
        // in-place
        obstacleGrid[0][0] = 1;
        // Filling the values for the first column
        for (int i = 1; i < rows; i++) {
            obstacleGrid[i][0] = (obstacleGrid[i][0] == 0 && obstacleGrid[i - 1][0] == 1) ? 1 : 0;
        }

        // Filling the values for the first row
        for (int j = 1; j < cols; j++) {
            obstacleGrid[0][j] = (obstacleGrid[0][j] == 0 && obstacleGrid[0][j - 1] == 1) ? 1 : 0;
        }
        
        for (int row=1; row<rows; row++) {
            for (int col=1; col<cols; col++) {
                if (obstacleGrid[row][col] == 1)
                    obstacleGrid[row][col] = 0;
                else
                    obstacleGrid[row][col] = obstacleGrid[row-1][col] + obstacleGrid[row][col-1];
            }
        }
        return obstacleGrid[rows-1][cols-1];
    }
}