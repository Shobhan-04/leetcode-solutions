class Solution:
    def longestPalindrome(self, s: str) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for set.
        '''

        n = len(s)

        unique_set = set()

        i, len_longest_palindrome = 0, 0

        while(i < n) : # O(n)
            s_ch = s[i]

            if(s_ch in unique_set) :
                len_longest_palindrome += 2
                unique_set.remove(s_ch)
            else :
                unique_set.add(s_ch)

            i += 1
        
        if(unique_set) :
            len_longest_palindrome += 1

        return(len_longest_palindrome)