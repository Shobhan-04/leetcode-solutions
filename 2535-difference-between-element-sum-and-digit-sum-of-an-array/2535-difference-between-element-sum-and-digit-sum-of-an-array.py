class Solution:
    def differenceOfSum(self, nums: list[int]) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(nums)

        i = 0
        digit_sum, elem_sum, absolute_sum = 0, 0, 0

        while(i < n) : # O(n)
            num = nums[i]
            elem_sum += num

            while(num > 0) :
                rem = (num % 10)
                digit_sum += rem
                num //= 10

            i += 1
        
        absolute_sum = abs(elem_sum - digit_sum)

        return absolute_sum