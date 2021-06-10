class Solution {
    public int numTrees(int n) {
        int[] G = new int[n + 1];
        G[0] = G[1] = 1;

        for (int _n = 2; _n <= n; _n++) {
            for (int i = 1; i <= _n; i++) {
                G[_n] += G[i - 1] * G[_n - i];
            }
        }
        return G[n];
    }
}