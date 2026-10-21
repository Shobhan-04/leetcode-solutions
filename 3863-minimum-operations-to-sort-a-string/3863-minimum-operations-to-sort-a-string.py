class Solution:
    def minOperations(self, s: str) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(s)
        i = 0

        is_sorted = True
        min_ch, max_ch = 'z', 'a'

        while(i < n) :
            s_ch = s[i]
            min_ch = min(min_ch, s_ch)
            max_ch = max(max_ch, s_ch)

            if(i > 0 and s_ch < s[i-1]) :
                is_sorted = False

            i += 1
        
        if(is_sorted == True) :
            return 0

        if(n == 2) : 
            return -1
        
        if(s[0] == min_ch or s[n-1] == max_ch) :
            return 1
        
        i = 1

        while(i < (n-1)) :
            if(s[i] == min_ch or s[i] == max_ch) :
                return 2

            i += 1
        
        return 3