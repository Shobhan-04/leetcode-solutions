class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        /*
            E.g. :- [[1,5], [8,9], [2,3], [6,7], [6,9]]

            Time complexity = O(n), 
            Space complexity = O(1) -> In-place sorting is done using the built-in Comparator's compare() function.
        */
        
        int rows = intervals.length, cols = intervals[0].length;

        /* 
        Sorting the array in-place using the compare() function, based on the second value :-
            [[2,3], [1,5], [6,7], [6,9], [8,9]]
        */
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int prevInterval = 0, currentInterval = 0, countOverlappingIntervals = 1; 
        int minNonOverlappingIntervalsRemoval = -1;

        for(int i = 1; i < rows; i++){ // O(n)
            // Check whether current interval first value is greater than or equals to the previous interval first value then, 

            currentInterval = i;
            
            if(intervals[currentInterval][0] >= intervals[prevInterval][1]){
                countOverlappingIntervals++; // count the overlapping intervals.
                prevInterval = currentInterval; // Set the previous interval as current interval.
            }

        }

        // Non-overlapping intervals = (Total no. of intervals - Overlapping intervals) :-
        minNonOverlappingIntervalsRemoval = (rows - countOverlappingIntervals);

        // Return the minimum number of intervals that, we need to remove to make the rest of the intervals non-overlapping :-
        return minNonOverlappingIntervalsRemoval;
    }
}