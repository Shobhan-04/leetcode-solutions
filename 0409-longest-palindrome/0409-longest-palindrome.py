class Solution:
    def longestPalindrome(self, s: str) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for dictionary.
        '''

        n = len(s)

        d = dict()

        i, len_longest_palindrome, odd_char_count = 0, 0, 0

        while(i < n) : # O(n)
            s_ch = s[i]
            d[s_ch] = d.get(s_ch, 0) + 1

            value = d[s_ch]

            if(value % 2 != 0) :
                odd_char_count += 1
            else :
                odd_char_count -= 1

            i += 1
        
        if(odd_char_count >= 1) :
            len_longest_palindrome = (n - odd_char_count + 1)
        else :
            len_longest_palindrome = n

        return(len_longest_palindrome)