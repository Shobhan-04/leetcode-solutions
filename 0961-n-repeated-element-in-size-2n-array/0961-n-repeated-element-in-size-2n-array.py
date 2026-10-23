class Solution:
    def repeatedNTimes(self, nums: list[int]) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(nums)

        i = 2

        while(i < n) :
            num = nums[i]

            if(num == nums[i-1] or num == nums[i-2]) :
                return num

            i += 1
        
        return(nums[0])