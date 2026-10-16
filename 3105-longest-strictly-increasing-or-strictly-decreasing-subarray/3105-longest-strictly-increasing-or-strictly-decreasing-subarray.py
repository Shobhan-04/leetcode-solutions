class Solution:
    def longestMonotonicSubarray(self, nums: List[int]) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n, i = len(nums), 1

        longest_subarray_length = 1
        decreasing_count, increasing_count = 1, 1

        while(i < n) :
            curr_elem, prev_elem = nums[i], nums[i-1]

            if(curr_elem < prev_elem) :
                decreasing_count += 1
                increasing_count = 1 # reset
            elif(curr_elem > prev_elem) :
                increasing_count += 1
                decreasing_count = 1
            else :
                increasing_count = 1
                decreasing_count = 1
            
            longest_subarray_length = max(longest_subarray_length, max(decreasing_count, increasing_count))

            i += 1
        
        return longest_subarray_length
