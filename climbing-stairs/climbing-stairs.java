class Solution {
    public int climbStairs(int n) {
        int[] steps = new int[n];
        if (n==1)
            return 1;
        if (n==2)
            return 2;
        if (n==3)
            return 3;
        
        // steps[i] stores how many steps there are to reach ith floor
        steps[0] = 1;
        steps[1] = 2;
        steps[2] = 3;
        // steps[i] = steps[i-1] + steps[i-2]
        for (int i=3; i<n; i++) {
            steps[i] = steps[i-1] + steps[i-2];
        }
        
        return steps[n-1];
    }
}