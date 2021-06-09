class Solution {
    public int uniquePaths(int m, int n) {
        int[][] A = new int[m][n];
        for (int row=0; row<m; row++) {
            for (int col=0; col<n; col++) {
                if (row==0 || col==0)
                    A[row][col] = 1;
                else
                    A[row][col] = A[row-1][col] + A[row][col-1];
            }
        }
        return A[m-1][n-1];
    }
}