class Solution:
    def minInsertions(self, s: str) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(s)
        i, min_insertions_count = 0, 0
        result, close_brackets_count = 0, 0

        while(i < n) : # O(n)
            sCh = s[i]

            if(sCh == '(') :
                close_brackets_count += 2
                if(close_brackets_count % 2 != 0) :
                    result += 1
                    close_brackets_count -= 1
            
            else :
                close_brackets_count -= 1
                if(close_brackets_count < 0) : 
                    result += 1
                    close_brackets_count += 2

            i += 1

        min_insertions_count = (result + close_brackets_count)

        return(min_insertions_count)