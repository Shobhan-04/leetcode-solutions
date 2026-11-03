class Solution:
    def isValid(self, s: str) -> bool:
        '''
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space or the Stack.
        '''

        n = len(s)
        self.stack = []

        # If n is of odd length :-
        if(n % 2 != 0) :
            return False

        i = 0

        while(i < n) :
            s_ch = s[i]

            if(s_ch == '(' or s_ch == '[' or s_ch == '{') :
                self.stack.append(s_ch)
            
            else :
                if(len(self.stack) == 0) :
                    return(False)
                
                top_elem = self.stack.pop()
    
                if(s_ch == ')' and top_elem != '(') :
                    return(False)
                elif(s_ch == ']' and top_elem != '[') :
                    return(False)
                elif(s_ch == '}' and top_elem != '{') :
                    return(False)

            i += 1
        
        return(len(self.stack) == 0)