class Solution {
    public int minCostClimbingStairs(int[] cost) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = cost.length;
        int stepMinusTwo = cost[0], stepMinusOne = cost[1];
        int climbingStairsMinCost = -1;

        for(int i = 2; i < n; i++){
            int stepOffCostCurrentStair = Math.min(stepMinusTwo, stepMinusOne);
            int currentCost = cost[i] + stepOffCostCurrentStair;
            stepMinusTwo = stepMinusOne;
            stepMinusOne = currentCost;
        }

        climbingStairsMinCost = Math.min(stepMinusTwo, stepMinusOne);

        return(climbingStairsMinCost);
    }
}