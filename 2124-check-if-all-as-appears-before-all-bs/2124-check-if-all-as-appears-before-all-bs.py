class Solution:
    def checkString(self, s: str) -> bool:
        '''
            Time complexity = O(1), 
            Space complexity = O(1)
        '''

        b_after_a = "ba"

        if(b_after_a not in s) :
            return True
        
        return False