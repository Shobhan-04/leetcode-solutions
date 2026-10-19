class Solution:
    def minElements(self, nums: list[int], limit: int, goal: int) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(nums)

        i, sum_nums = 0, 0

        while(i < n) : # O(n)
            sum_nums += nums[i]
            i += 1
        
        difference = abs(goal - sum_nums)

        min_elements_count = (difference + limit - 1) // limit

        return min_elements_count