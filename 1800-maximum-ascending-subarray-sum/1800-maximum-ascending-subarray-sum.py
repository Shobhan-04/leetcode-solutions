class Solution:
    def maxAscendingSum(self, nums: list[int]) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''
        
        n = len(nums)

        i = 1
        curr_sum, max_asc_subarray_sum = nums[0], nums[0]

        while(i < n) :
            num = nums[i]

            if(num > nums[i-1]) :
                curr_sum += num
            else :
                curr_sum = num
            
            max_asc_subarray_sum = max(max_asc_subarray_sum, curr_sum)

            i += 1
        
        return max_asc_subarray_sum