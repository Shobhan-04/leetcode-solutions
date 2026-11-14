class Solution {
    public int findUpperBound(int[][] intervals, int left, int right, int targetEnd){
        int ans = (right + 1);

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(intervals[mid][0] > targetEnd){
                ans = mid;
                right = (mid - 1);
            }else{
                left = (mid + 1);
            }
        }

        return(ans);
    }

    public int countIntersectingIntervals(int[][] intervals) {
        /*
            Optimized approach :-
                -> Step-1 : Sort the intervals based on the starting point.
                -> Step-2 : Apply binary search to current interval end. 

                Time complexity = O(n log(n)), 
                Space complexity = O(1)
        */
        
        int n = intervals.length;
        int result = 0;

        if(intervals == null || n == 0) return 0;
        
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0])); // O(n log(n))

        // Binary Search :-
        for(int i = 0; i < n - 1; i++){
            int currentEnd = intervals[i][1];

            // Find the index of the first interval starting stricly after the currentEnd.
            int firstNonIntersectingIndex = findUpperBound(intervals, i+1, n-1, currentEnd);

            // All intervals from (i+1) to (firstNonIntersectingIndex - 1) overlap with intervals[i].
            result += (firstNonIntersectingIndex - (i + 1));
        }

        return result;
    }
}