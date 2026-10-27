class Solution:
    def judgeCircle(self, moves: str) -> bool:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        i, left_move, right_move, up_move, down_move = 0, 0, 0, 0, 0
        n = len(moves)

        while(i < n) : # O(n)
            moves_ch = moves[i]

            if(moves_ch == 'L') :
                left_move += 1
            elif(moves_ch == 'R') :
                right_move += 1
            elif(moves_ch == 'U') :
                up_move += 1
            elif(moves_ch == 'D') :
                down_move += 1

            i += 1
        
        if((left_move == right_move) and (up_move == down_move)) :
            return True

        return False