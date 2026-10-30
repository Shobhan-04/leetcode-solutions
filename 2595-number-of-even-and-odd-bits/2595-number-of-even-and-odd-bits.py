class Solution:
    def evenOddBit(self, n: int) -> list[int]:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        i, even, odd = 0, 0, 0

        result = [0] * 2

        while(n != 0) :
            if(n % 2 != 0) :
                if(i % 2 == 0) :
                    even += 1
                else :
                    odd += 1
                
            n //= 2

            i += 1
            
        
        result[0] = even
        result[1] = odd 

        return result