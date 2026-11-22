class Solution:
    def longestSubarray(self, nums: list[int]) -> int:
        '''
            Sliding window approach :-
                Time complexity = O(n), 
                Space complexity = O(1)
        '''

        n = len(nums)
        left, right, zero_count = 0, 0, 0
        size_of_longest_non_empty_subarray, max_window_size = 0, 0

        for right in range(n) :
            right_num = nums[right]

            if(right_num == 0) :
                zero_count += 1
            
            while(zero_count > 1) :
                left_num = nums[left]

                if(left_num == 0) :
                    zero_count -= 1
                
                left += 1
            
            size_of_longest_non_empty_subarray = max(size_of_longest_non_empty_subarray, (right - left))
        
        if(zero_count == 0) : 
            return(n - 1)
            
        return size_of_longest_non_empty_subarray