class Solution:
    def maxScore(self, s: str) -> int:
        '''
            Better approach :-

                Time complexity = O(n + n) = O(2 * n) = O(n), 
                Space complexity = O(1)
        '''

        n = len(s)
        result = float('-inf')

        total_ones, left_ones, left_zeros = 0, 0, 0

        for i in range(n) :
            if(s[i] == '1') :
                total_ones += 1
            
        i = 0

        while(i <= (n - 2)) :
            if(s[i] == '1') :
                left_ones += 1
            else :
                left_zeros += 1

            right_ones = (total_ones - left_ones) 

            i += 1 
        
            result = max(result, (right_ones + left_zeros))

        return(result)