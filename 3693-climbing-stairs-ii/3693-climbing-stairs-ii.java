class Solution {
    public int climbStairs(int n, int[] costs) {
        /*
            Optimized approach using DP (Bottom - Up Approach) :-
                Time complexity = O(n), 
                Space complexity = O(n)
        */
        
        n = costs.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, 0);

        int cost = 0;

        for(int i = n - 1; i >= 0; i--){ // O(n)
            int j = (i + 1);
            if(j <= n){
                cost = (costs[j - 1] + (int) Math.pow((j - i), 2) + dp[j]);
            }

            j = (i + 2);
            if(j <= n){
                cost = Math.min(cost, (costs[j - 1] + (int) Math.pow((j - i), 2) + dp[j]));
            }

            j = (i + 3);
            if(j <= n){
                cost = Math.min(cost, (costs[j - 1] + (int) Math.pow((j - i), 2) + dp[j]));
            }

            dp[i] = cost;
        }
        
        return dp[0];
    }
}