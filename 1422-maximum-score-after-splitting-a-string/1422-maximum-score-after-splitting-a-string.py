class Solution:
    def maxScore(self, s: str) -> int:
        '''
            Brute Force approach :-

                Time complexity = O(n^2), 
                Space complexity = O(1)
        '''

        n = len(s)
        result = float('-inf')

        i = 0

        while(i <= (n - 2)) :
            zero_count = 0
            j = 0

            while(j <= i) :
                if(s[j] == '0') :
                    zero_count += 1

                j += 1
            
            k = (i + 1)
            one_count = 0

            while(k < n) :
                if(s[k] == '1') :
                    one_count += 1

                k += 1

            i += 1 
        
            result = max(result, (one_count + zero_count))

        return(result)