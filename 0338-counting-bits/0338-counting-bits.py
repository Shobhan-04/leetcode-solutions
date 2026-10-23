class Solution:
    def countBits(self, n: int) -> list[int]:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        binary_arr = [0] * (n + 1)

        i = 0

        while(i < (n + 1)) : # O(n)
            if(i % 2 == 0) : # For even indices 
                binary_arr[i] = binary_arr[i // 2] 
            else : # For odd indices
                binary_arr[i] = binary_arr[i // 2] + 1

            i += 1
        
        return binary_arr