class Solution:
    def findUpperBound(self, intervals: list[list[int]], left: int, right: int, target_end: int) -> int :
        ans = (right + 1)

        while(left <= right) :
            mid = left + (right - left) // 2

            if(intervals[mid][0] > target_end) :
                ans = mid 
                right = (mid - 1)
            else :
                left = (mid + 1)
        
        return ans

    def countIntersectingIntervals(self, intervals: list[list[int]]) -> int:
        '''
            Optimized Approach :-
                Time complexity = O(n log(n)), 
                Space complexity = O(1)
        '''

        result = 0
        n = len(intervals)

        # Base case :
        if(n == 0 or intervals == None) :
            return 0

        # Sorting based on the first element in the array :-
        intervals.sort(key = lambda x: x[0]) 

        for i in range(n) :
            current_end = intervals[i][1]
            first_non_repeating_index = self.findUpperBound(intervals, i+1, n-1, current_end)
            result += (first_non_repeating_index - (i + 1))

        return result