class Solution:
    def maxSum(self, nums: List[int]) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(nums)

        i = 0
        max_negative, max_subarray_sum = float('-inf'), 0
        unique_set = set()

        while(i < n) :
            num = nums[i]

            if(num <= 0) :
                max_negative = max(max_negative, num)
            
            elif(num not in unique_set) :
                max_subarray_sum += num
                unique_set.add(num)
            
            i += 1
        
        return max_negative if(max_subarray_sum == 0) else max_subarray_sum