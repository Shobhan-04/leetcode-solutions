class Solution {
    public long findUpperBound(int[][] intervals, int left, int right, int targetEnd){
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

        return ans;
    }

    public long countIntersectingIntervals(int[][] intervals) {
        /*
            Optimised Approach :-
                Time complexity = O(n log(n)), 
                Space complexity = O(1) 
        */
        
        long result = 0;
        int n = intervals.length;

        if(intervals == null || n == 0) return 0;

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        for(int i = 0; i < n-1; i++){
            int currentEnd = intervals[i][1];
            long firstNonRepeatingIndex = findUpperBound(intervals, i+1, n-1, currentEnd);
            result += (firstNonRepeatingIndex - (i + 1));
        }

        return result;
    }
}