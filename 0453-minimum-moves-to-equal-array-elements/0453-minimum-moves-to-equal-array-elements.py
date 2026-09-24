class Solution:
    def minMoves(self, nums: list[int]) -> int:
        '''
            sum + (n-1) * m = x * n - (i)
            minVal + m = x -(ii)
            => sum + (n-1) * m = (minVal + m) * n
            => sum + (n-1) * m = (minVal * n + m * n)
            => sum + (n * m - m) = (minVal * n + m * n)
            => sum - (minVal * n + m) = (m * n - n * m)
            => m = sum - (minVal * n)

            Time Complexity = O(n), 
            Space complexity = O(1)
        '''

        return(sum(nums) - min(nums) * len(nums))