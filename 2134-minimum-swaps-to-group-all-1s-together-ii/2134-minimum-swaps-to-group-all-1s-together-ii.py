class Solution:
    def minSwaps(self, nums: list[int]) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(nums)
        minimum_number_of_swaps = float('inf')
        number_of_swaps, i, total_ones_count, curr_window_ones_count, left = 0, 0, 0, 0, 0

        for num in nums :
            if(num == 1) :
                total_ones_count += 1

        if(total_ones_count == 0 or total_ones_count == n) :
            return 0
        
        for right in range(n + total_ones_count - 1) :
            right_num = nums[right % n]

            if(right_num == 1) :
                curr_window_ones_count += 1

            while((right - left + 1 > total_ones_count)) :
                left_num = nums[left % n]

                if(left_num == 1) :
                    curr_window_ones_count -= 1

                left += 1

            if((right - left + 1) == total_ones_count) :
                number_of_swaps = (total_ones_count - curr_window_ones_count)
                minimum_number_of_swaps = min(minimum_number_of_swaps, number_of_swaps)
        
        return minimum_number_of_swaps