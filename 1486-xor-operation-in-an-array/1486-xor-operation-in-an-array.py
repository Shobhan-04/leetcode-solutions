class Solution:
    def xorRange(self, N : int) -> int :
        '''
            (N = -1) : 0
            (N = 0) : 0
            (N = 1) : 1
            (N = 2) : (1 ^ 2) = 3
            (N = 3) : (1 ^ 2 ^ 3) = 0
            (N = 4) : (1 ^ 2 ^ 3 ^ 4) = 4
            (N = 5) : (1 ^ 2 ^ 3 ^ 4 ^ 5) = 1
            (N = 6) : (1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6) = 7
            (N = 7) : (1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6 ^ 7) = 0
            (N = 8) : (1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6 ^ 7 ^ 8) = 8
            (N = 9) : (1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6 ^ 7 ^ 8 ^ 9) = 1
            (N = 10) : (1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6 ^ 7 ^ 8 ^ 9 ^ 10) = 11
        '''

        if(N < 0) :
            return 0
        
        if(N % 4 == 0) :
            return N
        elif(N % 4 == 1) :
            return 1
        elif(N % 4 == 2) :
            return(N + 1)
        elif(N % 4 == 3) :
            return 0

    def xorOperation(self, n: int, start: int) -> int:     
        '''
            Time complexity = O(1), 
            Space complexity = O(1)
        '''

        s = (start >> 1)
        end = (s + n - 1)

        bitwise_xor_result = self.xorRange(s-1) ^ self.xorRange(end)
    
        return(bitwise_xor_result << 1 | ((n & 1) * (start & 1)))