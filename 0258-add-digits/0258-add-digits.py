class Solution:
    def addDigits(self, num: int) -> int:
        '''
            Time complexity = O(1), 
            Space complexity = O(1)
        '''

        if(num == 0) :
            return 0

        if(num > 0) :
            return(1 + (num - 1) % 9)