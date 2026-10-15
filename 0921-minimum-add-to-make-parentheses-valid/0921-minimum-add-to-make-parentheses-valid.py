class Solution:
    def minAddToMakeValid(self, s: str) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(s)

        i = 0
        stack_size, open_bracket_count = 0, 0
        min_moves = 0

        while(i < n) : # O(n)
            s_ch, open_bracket_ch = s[i], '('

            if(s_ch == open_bracket_ch) :
                stack_size += 1
            elif(stack_size > 0) :
                stack_size -= 1
            else :
                open_bracket_count += 1

            i += 1
        
        min_moves = (open_bracket_count + stack_size)

        return min_moves