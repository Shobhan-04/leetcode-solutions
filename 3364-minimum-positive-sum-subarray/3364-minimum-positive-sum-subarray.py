class Solution:
    def minimumSumSubarray(self, nums: List[int], l: int, r: int) -> int:
        '''
            Time complexity = O(n^2), 
            Space complexity = O(1)
        '''

        n = len(nums)

        i, min_pos_sum_subarray = 0, float('inf')

        while(i < n) : # O(n)
            j, current_window_sum = i, 0

            while(j < n) : # O(n)
                range = (j - i + 1)
                current_window_sum += nums[j]

                if(range >= l and range <= r and current_window_sum > 0) :
                    min_pos_sum_subarray = min(min_pos_sum_subarray, current_window_sum)

                j += 1

            i += 1
        
        return -1 if min_pos_sum_subarray == float('inf') else min_pos_sum_subarray