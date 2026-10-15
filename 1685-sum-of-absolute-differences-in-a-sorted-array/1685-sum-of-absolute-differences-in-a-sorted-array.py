class Solution:
    def getSumAbsoluteDifferences(self, nums: List[int]) -> List[int]:
        '''
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for the prefix_sum list.
        '''

        n = len(nums)

        result = [0] * n
        prefix_sum = [0] * n
        prefix_sum[0] = nums[0]

        i = 1

        # Calculate the prefix sum :-
        while(i < n) :
            prefix_sum[i] = prefix_sum[i-1] + nums[i]
            i += 1
        
        i = 0

        while(i < n) :
            left_sum = prefix_sum[i] - nums[i]
            right_sum = prefix_sum[n-1] - prefix_sum[i]

            result[i] = (nums[i] * i) - left_sum + right_sum - (nums[i] * (n-i-1))
            i += 1
        
        return result