class Solution:
    def isMonotonic(self, nums: list[int]) -> bool:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(nums)
        is_increasing, is_decreasing = True, True
        i, j = 0, 1

        while(j < n) :
            if(nums[i] < nums[j]) :
                is_decreasing = False
            elif(nums[i] > nums[j]) :
                is_increasing = False
            
            if(not is_increasing and not is_decreasing) :
                return(False)

            i += 1
            j += 1
        
        return(is_increasing or is_decreasing)