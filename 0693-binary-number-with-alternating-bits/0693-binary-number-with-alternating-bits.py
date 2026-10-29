class Solution:
    def hasAlternatingBits(self, n: int) -> bool:
        '''
            Time complexity = O(log(n)), 
            Space complexity = O(1)
        '''

        is_alternating_bits = True
        current_bit = 1 if(n % 2 == 0) else 0

        while(n > 0) : # O(log(n))
            last_bit = (n % 2)

            if(current_bit == last_bit) :
                is_alternating_bits = False
            
            current_bit = last_bit
            n //= 2
            
        return is_alternating_bits