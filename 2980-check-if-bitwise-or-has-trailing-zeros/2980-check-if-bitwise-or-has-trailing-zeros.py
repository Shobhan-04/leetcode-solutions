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

            if(num % 2 == 0) :
                even_count += 1
            
            if(even_count == 2) :
                return True
        
        return False