class Solution:
    def checkOnesSegment(self, s: str) -> bool:
        '''
            Time complexity = O(1), 
            Space complexity = O(1)
        '''

        return("01" not in s)