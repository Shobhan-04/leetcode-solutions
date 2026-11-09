class Solution:
    def isMonotonic(self, nums: list[int]) -> bool:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(nums)
        is_increasing, is_decreasing = True, True

        for i in range(0, n-1, 1) :
            if(nums[i] < nums[i + 1]) :
                is_decreasing = False
            elif(nums[i] > nums[i + 1]) :
                is_increasing = False
            
            if(not is_increasing and not is_decreasing) :
                return(False)
        
        return(is_increasing or is_decreasing)