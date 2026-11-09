class Solution:
    def smallestRangeI(self, nums: list[int], k: int) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(nums)
        i = 0
        max_val, min_val, score, min_score = float('-inf'), float('inf'), 0, float('inf')

        while(i < n) : # O(n)
            min_val = min(min_val, nums[i])
            max_val = max(max_val, nums[i])

            i += 1

        min_score = (max_val - min_val - (2 * k))
        min_score = max(min_score, score)

        return(min_score)