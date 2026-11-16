class Solution:
    def addDigits(self, num: int) -> int:
        '''
            Time complexity = O(1), 
            Space complexity = O(1)
        '''

        if(num == 0) :
            return 0
        
        if(num % 9 == 0) :
            return 9
        
        return(num % 9)