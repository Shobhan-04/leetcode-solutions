class Solution:
    def maxDepth(self, s: str) -> int:
        '''
            Time complexity = O(n) 
            Space complexity = O(1)
        '''

        n, open_brackets_count, nesting_depth = len(s), 0, 0

        i = 0

        while(i < n) : # O(n)
            s_ch = s[i]

            if(s_ch == '(') :
                open_brackets_count += 1
            elif(s_ch == ')') :
                open_brackets_count -= 1
            
            nesting_depth = max(nesting_depth, open_brackets_count)

            i += 1
        
        return(nesting_depth)