class Solution:
    def longestNiceSubstring(self, s: str) -> str:
        '''
            Time complexity = O(n^2), 
            Space complexity = O(n)
        '''

        n = len(s)

        lower_set, upper_set = set(), set()

        for j in range(n) : # O(n)
            s_ch = s[j]

            if(s_ch.islower()) :
                lower_set.add(s_ch)
            else :
                upper_set.add(s_ch)
        
        for i in range(n) : # O(n)
            s_ch = s[i]
            lower_ch = s_ch.lower()
            upper_ch = s_ch.upper()

            if(lower_ch not in lower_set or upper_ch not in upper_set) :
                before_substring = s[0 : i]
                after_substring = s[i + 1 : n]

                before_result = self.longestNiceSubstring(before_substring)
                after_result = self.longestNiceSubstring(after_substring)

                if(len(before_result) >= len(after_result)) :
                    return(before_result)
                else :
                    return(after_result)
            
        return s