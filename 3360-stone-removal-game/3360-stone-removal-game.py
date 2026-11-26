class Solution:
    def canAliceWin(self, n: int) -> bool:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        no_of_stones = 10 # Alice starts by removing exactly 10 stones on her first turn.
        turn = 'a' # Initially, trurn is started from 'a'.

        while(no_of_stones <= n) :
            if(turn == 'a') :
                turn = 'b'
            else :
                turn = 'a'
            
            n -= no_of_stones
            no_of_stones -= 1
        
        return(True if(turn == 'b') else False)