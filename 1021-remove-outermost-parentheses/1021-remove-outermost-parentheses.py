class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        '''
            Time complexity = O(n), 
            Space complexity = O(n)
        '''

        n = len(s)
        result = ""
        brackets_count = 0

        i = 0

        while(i < n) :
            s_ch = s[i]

            if(s_ch == '(') :
                if(brackets_count != 0) :
                    result += s_ch
                brackets_count += 1 # increment, if we enconter an open parantheses.

            else :
                brackets_count -= 1 # decrement, if we encounter a closed parantheses.
                if(brackets_count != 0) :
                    result += s_ch
            
            i += 1
        
        return result