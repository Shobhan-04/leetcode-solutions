class Solution:
    def minMoves2(self, nums: list[int]) -> int:
        '''
            Time complexity = O(n log(n)) + O(n) = O(n log(n)), 
            Space complexity = O(1)
        '''

        n = len(nums)
        i, min_moves = 0, 0
        
        nums.sort() # O(n log(n))

        mid = nums[n // 2]

        while(i < n) : # O(n)
            min_moves += abs(nums[i] - mid)
            i += 1
        
        return min_moves