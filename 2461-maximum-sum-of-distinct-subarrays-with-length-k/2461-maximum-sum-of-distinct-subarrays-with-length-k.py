class Solution:
    def maximumSubarraySum(self, nums: list[int], k: int) -> int:
        '''
            Time complexity = O(n),
            Space complexity = O(k) -> Auxilliary space for the HashSet, for holding atmost k integers.
        '''

        n = len(nums)
        unique_set = set()
        left = 0
        maximum_subarray_sum, current_window_sum = 0, 0

        for right in range(n) :
            right_num = nums[right]

            while(right_num in unique_set or (right - left + 1) > k) :
                left_num = nums[left]
                current_window_sum -= left_num
                unique_set.remove(left_num)
                left += 1
            
            unique_set.add(right_num)
            current_window_sum += right_num

            current_window_length = (right - left + 1)
            if(current_window_length == k) :
                maximum_subarray_sum = max(maximum_subarray_sum, current_window_sum)
            
        return(0 if maximum_subarray_sum == 0 else maximum_subarray_sum)