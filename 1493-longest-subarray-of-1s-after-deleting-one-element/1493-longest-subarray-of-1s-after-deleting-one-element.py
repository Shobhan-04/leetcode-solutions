class Solution:
    def longestSubarray(self, nums: list[int]) -> int:
        '''
            Sliding window approach :-
                Time complexity = O(n), 
                Space complexity = O(1)
        '''

        n = len(nums)
        left, right = 0, 0
        size_of_longest_non_empty_subarray, max_window_size = 0, 0
        last_zero_index = -1

        for right in range(n) :
            right_num = nums[right]

            if(right_num == 0) :
                left = last_zero_index + 1
                last_zero_index = right
            
            size_of_longest_non_empty_subarray = max(size_of_longest_non_empty_subarray, (right - left))
            
        return size_of_longest_non_empty_subarray