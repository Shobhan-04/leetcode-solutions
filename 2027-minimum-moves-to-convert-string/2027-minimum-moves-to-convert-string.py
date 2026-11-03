class Solution:
    def minimumMoves(self, s: str) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n, i, min_moves = len(s), 0, 0

        while(i < n) : # O(n)
            s_ch = s[i]

            if(s_ch == 'X') :
                min_moves += 1
                i += 3
            else :
                i += 1
        
        return min_moves
