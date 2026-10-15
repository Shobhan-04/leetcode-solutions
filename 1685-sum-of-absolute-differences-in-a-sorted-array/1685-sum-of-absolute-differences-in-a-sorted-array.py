class Solution:
    def getSumAbsoluteDifferences(self, nums: List[int]) -> List[int]:
        '''
            Time complexity = O(n), 
            Space complexity = O(1) -> Auxilliary space for resultant list.
        '''

        n = len(nums)

        total_sum, i = 0, 0

        while(i < n) :
            total_sum += nums[i]
            i += 1
        
        i, left_sum = 0, 0

        result = [0] * n
        
        while(i < n) :
            left_count = i
            right_count = (n - i - 1)
            right_sum = (total_sum - left_sum - nums[i])

            left_diff = (nums[i] * left_count) - left_sum
            right_diff = right_sum - (nums[i] * right_count)

            result[i] = (left_diff + right_diff)

            left_sum += nums[i]
            i += 1
        
        return result