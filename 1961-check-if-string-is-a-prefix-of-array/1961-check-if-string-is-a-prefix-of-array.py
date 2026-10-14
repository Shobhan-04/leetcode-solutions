class Solution:
    def isPrefixString(self, s: str, words: list[str]) -> bool:
        '''
            Time complexity = O(m^2) -> Repeated string concatenation can create immediate temporary strings.

            Space complexity = O(m)
        '''

        m, n = len(s), len(words)

        # Base condition :-
        if(n == 0) : 
            return(s == " ")

        temp_str = words[0]
        k = len(temp_str)
        
        i = 1

        while(k < m and i < n) :
            word = words[i]
            temp_str += word
            k = len(temp_str)
            i += 1
        
        if(temp_str == s) : 
            return True
        
        return False