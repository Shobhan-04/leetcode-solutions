class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        /*
            Time complexity = O(1),
            Space complexity = O(1)
        */
        
        long minPossibleTotalCost = 0;
        
        long needBoth = Math.min(need1, need2);
        minPossibleTotalCost = needBoth * Math.min((long) costBoth, (long) cost1 + cost2);

        need1 -= needBoth;
        need2 -= needBoth;

        if(need1 > 0){
            minPossibleTotalCost += need1 * Math.min((long) costBoth, (long) cost1);
        }else if(need2 > 0){
            minPossibleTotalCost += need2 * Math.min((long) costBoth, (long) cost2);
        }

        return minPossibleTotalCost;
    }
}