class Solution {
    public int climbStairs(int n) {
        
        if (n==1 || n==2)
            return n;
        
        int[] steps = new int[n];
        // steps[i] stores how many steps there are to reach ith floor
        steps[0] = 1;
        steps[1] = 2;
        
        // steps[i] = steps[i-1] + steps[i-2]
        for (int i=2; i<n; i++) {
            steps[i] = steps[i-1] + steps[i-2];
        }
        
        return steps[n-1];
    }
}