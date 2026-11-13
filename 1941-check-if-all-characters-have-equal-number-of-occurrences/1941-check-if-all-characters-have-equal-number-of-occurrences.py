class Solution:
    def areOccurrencesEqual(self, s: str) -> bool:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(s)
        count_freq = [0] * 26

        for i in range(n) : # O(n)
            s_ch = s[i]
            count_freq[ord(s_ch) - ord('a')] += 1

        count = 0

        for i in range(26) : # O(26)
            count_elem = count_freq[i]

            if(count_elem != 0 and count == 0) :
                count = count_elem
            elif(count_elem != 0) :
                if(count != count_elem) :
                    return False
        
        return True