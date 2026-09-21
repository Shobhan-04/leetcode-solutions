class Solution:
    def countGoodSubstrings(self, s: str) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        left, right = 0, 2
        n = len(s)
        count = 0

        while(right < n) :
            if s[left] != s[left + 1] and \
            s[left + 1] != s[left + 2] and \
            s[left + 2] != s[left] :

                count += 1
            
            left += 1
            right += 1
        
        return count

        