class Solution:
    def numberOfPoints(self, nums: List[List[int]]) -> int:
        '''
            Brute Force approach :-
                Time complexity = O(n * m), where n is the number of intervals and m is the average length of an interval.

                Space complexity = O(n) -> Auxilliary space for storing the intersecting points in the set.
        '''

        n = len(nums)
        unique_points_set = set()
        start, end = 0, 0 

        for lst in nums : # O(n)
            start, end = lst[0], lst[1]

            for num in range(start, end + 1, 1) : # O(m)
                if(num not in unique_points_set) :
                    unique_points_set.add(num)

        return len(unique_points_set)