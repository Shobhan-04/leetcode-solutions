class Solution:
    def countSubarrays(self, nums: List[int]) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(nums)

        i, subarray_len_3_count = 1, 0

        while(i < (n-1)) :
            num_prev, num_mid, num_next = nums[i-1], nums[i], nums[i+1]
            sum_first_third_nos = (num_prev + num_next)

            if((2 * sum_first_third_nos) == num_mid) :
                subarray_len_3_count += 1

            i += 1
        
        return subarray_len_3_count