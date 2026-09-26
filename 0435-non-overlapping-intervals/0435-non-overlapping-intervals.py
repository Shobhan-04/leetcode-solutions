class Solution:
    def eraseOverlapIntervals(self, intervals: list[list[int]]) -> int:
        '''
            E.g. :- [[1,5], [8,9], [2,3], [6,7], [6,9]]

            Time complexity = O(n), 
            Space complexity = O(1) -> In-place sorting done using the lambda function.
        '''

        # Sorting the intervals based on the 2nd index of each of the list of lists.
        intervals.sort(key = lambda x : x[1]) # [[2,3], [1,5], [6,7], [6,9], [8,9]]
        n = len(intervals) 
        prev, count = 0, 1

        for i in range(1, n) : # O(n)
            if(intervals[i][0] >= intervals[prev][1]) :
                count += 1 # counting the overlapping intervals.
                prev = i 
        
        return(n - count) # Non-overlapping intervals = (All intervals - overlapping intervals)