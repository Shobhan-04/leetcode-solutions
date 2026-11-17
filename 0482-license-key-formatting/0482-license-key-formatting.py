class Solution:
    def licenseKeyFormatting(self, s: str, k: int) -> str:
        '''
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for the list.
        '''

        n = len(s)
        count = 0
        res = []

        for i in range(n-1, -1, -1) : # Iterate backwards to form the groups.
            s_ch = s[i]

            if(s_ch == '-') : # Check ch == '-' then, skip '-'.
                continue
            
            if(count == k) :
                res.append('-') # append '-' into res.
                count = 0 # reset
        
            res.append(s_ch.upper()) # convert the res into uppercase.
            count += 1 # Increment the count.

        return("".join(res[::-1])) # reverse the string to get the required reformatted string.