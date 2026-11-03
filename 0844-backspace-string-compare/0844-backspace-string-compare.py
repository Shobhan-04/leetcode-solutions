class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        '''
            Time complexity = O(m + n), 
            Space complexity = O(n) -> Auxilliary space for the stack1 and stack2.
        '''

        m, n = len(s), len(t)
        self.stack1, self.stack2 = [], []

        for i in range(m) : # O(m)
            s_ch = s[i]

            if(s_ch != '#') :
                self.stack1.append(s_ch)
            elif(s_ch == '#' and len(self.stack1) > 0) :
                self.stack1.pop()
        
        for i in range(n) : # O(n)
            t_ch = t[i]

            if(t_ch != '#') :
                self.stack2.append(t_ch)
            elif(t_ch == '#' and len(self.stack2) > 0) :
                self.stack2.pop()
        
        return(self.stack1 == self.stack2)