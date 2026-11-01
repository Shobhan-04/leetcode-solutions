class Solution:
    def minMoves(self, nums: list[int]) -> int:
        '''
            [1, 2, 3] -> [1, 2, 2] -> [1, 2, 1] -> [1, 1, 1]
            => This represents, counting the minimum no. of steps required to reduce to 1.
                Approach :-
                1. Find the minimum most element in the array.
                2. Find the steps, so as to reduce each and every element to that minimum element.
                3. return that step.

            Time Complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(nums)

        i = 0
        min_moves, min_element = float('inf'), float('inf')
        sum_elements = 0

        while(i < n) :
            sum_elements += nums[i]
            min_element = min(min_element, nums[i])

            i += 1

        min_moves = sum_elements - (n * min_element)

        return(min_moves)