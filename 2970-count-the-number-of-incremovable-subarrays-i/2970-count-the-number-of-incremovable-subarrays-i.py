class Solution:
    def is_increasing_subarray(self, nums: List[int], start: int, end: int) -> int :
        n = len(nums)
        prev_num = 0

        for i in range(n) : # O(n)
            curr_num = nums[i]

            if(i <= end and i >= start) :
                continue
            
            if(curr_num <= prev_num) :
                return False
            
            prev_num = curr_num
        
        return(True)

    def incremovableSubarrayCount(self, nums: List[int]) -> int:
        '''
            Time complexity = O(n^3), 
            Space complexity = O(1)
        '''

        n = len(nums)
        total_number_of_incremovable_subarrays = 0

        for i in range(n) : # O(n)
            for j in range(i, n, 1) : # O(n)
                if(self.is_increasing_subarray(nums, i , j)) :
                    total_number_of_incremovable_subarrays += 1
        
        return total_number_of_incremovable_subarrays