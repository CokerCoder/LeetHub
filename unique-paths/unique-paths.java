class Solution {
    public int uniquePaths(int m, int n) {
        int[][] A = new int[m][n];
        // initialize the first row and first column
        for (int i=0; i<m; i++) 
            A[i][0] = 1;
        for (int j=0; j<n; j++) 
            A[0][j] = 1;
        for (int row=1; row<m; row++) 
            for (int col=1; col<n; col++)
                A[row][col] = A[row-1][col] + A[row][col-1];
        return A[m-1][n-1];
    }
}