class Solution:
    def minQueenMoves(self, source: list[int], target: list[int]) -> int:
        '''
            Time complexity = O(1), 
            Space complexity = O(1)
        '''

        sr, sc = source[0], source[1]
        tr, tc = target[0], target[1]

        min_queen_moves_count = 0

        if((sr == tr) and (sc == tc)) :
            min_queen_moves_count = 0
        elif((sr == tr) or (sc == tc)) :
            min_queen_moves_count += 1
        elif(abs(sr - tr) == abs(sc - tc)) :
            min_queen_moves_count += 1
        else :
            min_queen_moves_count += 2
        
        return min_queen_moves_count