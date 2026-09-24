class Solution:
    def longestOnes(self, nums: list[int], k: int) -> int:
        '''
            Time complexity = O(n * k), 
            Space complexity = O(1)
        '''

        n, max_window_length = len(nums), -1
        left, right = 0, 0
        zeros_count = 0

        while(right < n) :
            if(nums[right] == 0) :
                zeros_count += 1

            while(zeros_count > k) :
                if(nums[left] == 0) :
                    zeros_count -= 1
                left += 1
                    
            if(zeros_count <= k) :
                current_window_length = (right - left + 1)
                max_window_length = max(max_window_length, current_window_length)

            right += 1

        return(max_window_length)