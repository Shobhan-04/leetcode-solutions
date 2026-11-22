class Solution:
    def checkString(self, s: str) -> bool:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(s)

        for i in range(1, n) :
            s_ch = s[i]

            if(s_ch == 'a' and s[i - 1] == 'b') : 
                return False
        
        return True