class Solution:
    def hasTrailingZeros(self, nums: List[int]) -> bool:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(nums)
        even_count = 0

        for i in range(n) :
            num = nums[i]

            if((num & 1) == 0) : # To check whether the number is even.
                even_count += 1
            
            if(even_count == 2) :
                return True
        
        return False