class Solution:
    def maximumCount(self, nums: list[int]) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(nums)
        positive_integer_count, negative_integer_count = 0, 0
        max_count = float('-inf')

        i = 0

        while(i < n) : # O(n)
            num = nums[i]
            if(num < 0) :
                negative_integer_count += 1
            elif(num > 0) :
                positive_integer_count += 1

            i += 1
        
        max_count = max(positive_integer_count, negative_integer_count)
        
        return(max_count)