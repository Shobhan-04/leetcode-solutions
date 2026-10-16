class Solution:
    def minimumSumSubarray(self, nums: List[int], l: int, r: int) -> int:
        '''
            Time complexity = O(nr), 
            Space complexity = O(1)
        '''

        n = len(nums)

        low = 0
        min_subarray_sum = float('inf')

        while(low <= (n - l)) :
            curr_subarray_sum = 0
            high = 1

            while(high <= r) :
                if(low + high - 1 >= n) :
                    break

                curr_subarray_sum += nums[low + high - 1]
                
                if(high >= l and curr_subarray_sum > 0) :
                    min_subarray_sum = min(min_subarray_sum, curr_subarray_sum)

                high += 1

            low += 1

        return -1 if(min_subarray_sum == float('inf')) else min_subarray_sum