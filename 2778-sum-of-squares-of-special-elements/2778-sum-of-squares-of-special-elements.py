class Solution:
    def sumOfSquares(self, nums: List[int]) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(nums)
        sum_special_squares = 0

        i = 0

        while(i < n) :
            if(n % (i + 1) == 0) : 
                num = nums[i]
                sum_special_squares += (num * num)

            i += 1
        
        return sum_special_squares