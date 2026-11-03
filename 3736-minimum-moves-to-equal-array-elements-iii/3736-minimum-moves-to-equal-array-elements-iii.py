class Solution:
    def minMoves(self, nums: List[int]) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(nums)

        i, max_element = 0, float('-inf')

        while(i < n) :
            max_element = max(max_element, nums[i])
            i += 1
        
        i, min_moves = 0, 0
        
        while(i < n) :
            min_moves += (max_element - nums[i])
            i += 1
        
        return min_moves