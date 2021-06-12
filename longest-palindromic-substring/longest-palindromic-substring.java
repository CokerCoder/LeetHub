class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        
        int start = -1;
        int end = -1;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);
                
                if (dp[i][j] && (start == -1 || end == -1 || j - i  > end - start)) {
                    start = i;
                    end = j;
                }
            }
        }
        return s.substring(start, end + 1);
    }
}