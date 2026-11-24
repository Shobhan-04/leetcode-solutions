class Solution:
    def checkZeroOnes(self, s: str) -> bool:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(s)

        current_ones, current_zeros, max_zeros, max_ones = 0, 0, 0, 0
        i = 0

        while(i < n) : # O(n)
            s_ch = s[i]

            if(s_ch == '1') :
                current_ones += 1
                current_zeros = 0 # Reset
                max_ones = max(max_ones, current_ones)
            
            elif(s_ch == '0') :
                current_zeros += 1
                current_ones = 0 # Reset
                max_zeros = max(max_zeros, current_zeros)
            
            i += 1
        
        if(max_ones > max_zeros) :
            return True
        
        return False