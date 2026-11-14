class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        /*
            Brute force approach :-
                Time complexity = O(m^2), 
                Space complexity = O(1)
        */
        
        int m = intervals.length, n = intervals[0].length;
        int result = 0;
        
        for(int i = 0; i < m; i++){ // O(m)
            for(int j = (i + 1); j < m; j++){ // O(m)
                int s1 = intervals[i][0], s2 = intervals[j][0];
                int e1 = intervals[i][1], e2 = intervals[j][1]; 

                if(Math.max(s1, s2) <= Math.min(e1, e2)){
                    result++;
                }
            }
        }

        return result;
    }
}