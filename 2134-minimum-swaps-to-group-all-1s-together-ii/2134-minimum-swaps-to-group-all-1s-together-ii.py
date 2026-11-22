class Solution:
    def minSwaps(self, nums: list[int]) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for the temp list of size (2 * n).
        '''

        n = len(nums)
        minimum_number_of_swaps = float('inf')
        left, right, number_of_swaps = 0, 0, 0
        total_ones_count, max_ones_count, curr_window_ones_count = 0, 0, 0
        temp = [0] * (2 * n)

        for i in range(n) :
            temp[i] = nums[i % n] 

        for i in range(n) :
            num = nums[i]
            if(num == 1) :
                total_ones_count += 1

        if(total_ones_count == 0 or total_ones_count == n) :
            return 0

        while(right < 2 * n) :
            right_temp_num = temp[right % n]
            if(right_temp_num == 1) :
                curr_window_ones_count += 1

            if((right - left + 1) > total_ones_count) :
                left_temp_num = temp[left % n]
                curr_window_ones_count -= left_temp_num
                left += 1
            
            max_ones_count = max(max_ones_count, curr_window_ones_count)
            right += 1
        
        minimum_number_of_swaps = (total_ones_count - max_ones_count)

        return minimum_number_of_swaps