class Solution:
    def longestValidParentheses(self, s: str) -> int:
        '''
            Time complexity = O(n) -> 2 linear traversals, 
            Space complexity = O(1)
        '''

        n = len(s)
        left, right = 0, (n - 1)
        open, close = '(', ')'
        open_count, close_count = 0, 0

        len_longest_valid_parantheses = 0

        # Left to Right traversal :-
        while(left < n) : # O(n)
            s_ch = s[left]
            
            if(s_ch == open) :
                open_count += 1
            else :
                close_count += 1

            if(open_count == close_count) :
                len_longest_valid_parantheses = max(len_longest_valid_parantheses, open_count + close_count)

            elif(close_count > open_count) :
                open_count = 0  # Reset back to 0.
                close_count = 0  # Reset back to 0.

            left += 1

        open_count, close_count = 0, 0 # Re-initialize
        
        # Right to Left traversal :-
        while(right >= 0) : # O(n)
            s_ch = s[right]

            if(s_ch == close) :
                close_count += 1
            else :
                open_count += 1

            if(open_count == close_count) :
                len_longest_valid_parantheses = max(len_longest_valid_parantheses, open_count + close_count)

            elif(open_count > close_count) :
                open_count = 0 # Reset back to 0.
                close_count = 0  # Reset back to 0.

            right -= 1
        
        return len_longest_valid_parantheses