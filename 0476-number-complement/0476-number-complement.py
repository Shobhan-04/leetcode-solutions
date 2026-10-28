class Solution:
    def findComplement(self, num: int) -> int:
        '''
            Time complexity = O(log2(num)), 
            Space complexity = O(1)
        '''

        i, complement_num = 0, 0

        while(num != 0) :
            bit_mask = (1 << i) # (1 * (2 ^ i))
            
            if(num & 1 == 0) :
                complement_num |= bit_mask 

            num >>= 1 # (num / (2 ^ 1))

            i += 1
        
        return complement_num