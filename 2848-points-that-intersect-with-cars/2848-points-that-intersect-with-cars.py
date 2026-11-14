class Solution:
    def numberOfPoints(self, nums: List[List[int]]) -> int:
        '''
            Better approach :-
                Time complexity = O(n * m), where n is the number of intervals and m is the average length of an interval.

                Space complexity = O(1) 
        '''

        n = len(nums)
        points_lst = [0] * (101)
        intersecting_points_count = 0
        start, end = 0, 0 

        for lst in nums : # O(n)
            start, end = lst[0], lst[1]

            for num in range(start, end + 1, 1) : # O(m)
                points_lst[num] += 1
            
        for point in points_lst :
            if(point != 0) :
               intersecting_points_count += 1 

        return intersecting_points_count