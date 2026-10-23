from math import floor, log10

class Solution:
    def findNumbers(self, nums: list[int]) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(n)
        '''

        n = len(nums)
        freqDict = dict()

        even_digits_count = 0

        for i in range(n) : # O(n)
            num = nums[i]

            if(num == 0) :
                num_of_digits = 1
            else :
                num_of_digits = floor(log10(num)) + 1

            freqDict[num_of_digits] = freqDict.get(num_of_digits, 0) + 1

            if(num_of_digits % 2 == 0) :
                even_digits_count += 1
            
        return(even_digits_count) 