class Solution:
    def countIntersectingIntervals(self, intervals: list[list[int]]) -> int:
        '''
            Brute force approach :-
                Time complexity = O(n^2), 
                Space complexity = O(1)
        '''

        n = len(intervals)
        result = 0

        for i in range(n) :
            for j in range(i+1, n) :
                s1, e1 = intervals[i][0], intervals[i][1]
                s2, e2 = intervals[j][0], intervals[j][1]

                if(max(s1, s2) <= min(e1, e2)) :
                    result += 1

        return result