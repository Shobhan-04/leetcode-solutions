class Solution:
    def findErrorNums(self, nums: list[int]) -> list[int]:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(nums)
        duplicate_num, missing_num = -1, -1
        result = [0] * 2

        for i in range(n) : # Loop for finding the duplicate no. in the array.
            num = abs(nums[i])

            if(nums[num - 1] < 0) :
                duplicate_num = num
            else :
                nums[num - 1] *= (-1)
            
        for i in range(n) : # Loop for finding the missing no. in the array.
            num = nums[i]

            if(num > 0) :
                missing_num = (i + 1)
        
        result = [duplicate_num, missing_num]

        return result