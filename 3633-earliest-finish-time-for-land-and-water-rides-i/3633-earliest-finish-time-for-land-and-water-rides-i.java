class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        /*
            Time complexity = O(m*n), 
            Space complexity = O(1)
        */
        
        int m = landStartTime.length, n = waterStartTime.length;
        
        int earliestPossibleTime = Integer.MAX_VALUE;

        // Activity - 1 : Land Ride first then, followed by water ride :-
        int i = 0;

        while(i < m){
            int landFinishTime = (landStartTime[i] + landDuration[i]);
            int j = 0;

            while(j < n){
                int waterFinishTime = Math.max(landFinishTime, waterStartTime[j]) + waterDuration[j];
                earliestPossibleTime = Math.min(earliestPossibleTime, waterFinishTime);
                
                j++;
            }

            i++;
        }

        i = 0;

        // Activity - 2 : Water activity first then, followed by the land activity :-
        while(i < n){
            int waterFinishTime = (waterStartTime[i] + waterDuration[i]);
            int j = 0;

            while(j < m){
                int landFinishTime = Math.max(waterFinishTime, landStartTime[j]) + landDuration[j];
                earliestPossibleTime = Math.min(earliestPossibleTime, landFinishTime);

                j++;
            }

            i++;
        }

        return earliestPossibleTime;
    }
}