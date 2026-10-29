class Solution:
    def reverseBits(self, n: int) -> int:
        '''
            Time complexity = O(1), 
            Space complexity = O(1)
        '''

        reversed_bits = 0

        for i in range(1, 33) :
            right_most_bit = (n & 1)

            reversed_bits <<= 1
            reversed_bits |= right_most_bit
            n >>= 1
        
        return reversed_bits