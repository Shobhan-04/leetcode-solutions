class Solution:
    def divideArray(self, nums: list[int]) -> bool:
        '''
            Time complexity = O(n log(n)), 
            Space complexity = O(1)
        '''

        n = len(nums)

        nums.sort() # O(n log(n))

        i = 0

        while(i < n) : # O(n)
            if(nums[i] != nums[i + 1]) :
                return False

            i += 2
        
        return True