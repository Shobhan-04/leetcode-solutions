class Solution:
    def maxLengthBetweenEqualCharacters(self, s: str) -> int:
        '''
            Optimal approach :-
                Time complexity = O(n), 
                Space complexity = O(1)
        '''

        n = len(s)
        result = float('-inf')
        freq = [-1] * 26 # Initially, fill the entire frequency aray with the value as -1.

        for i in range(n) :
            s_ch = s[i]

            # If freq doesn't contain that character :
            if(freq[ord(s_ch) - ord('a')] == -1) :
                freq[ord(s_ch) - ord('a')] = i # then, add that character into the freq.

            # result stores, the length of the longest substring between two equal characters, excluding the two characters. 
            else :
                result = max(result, i - freq[ord(s_ch) - ord('a')] - 1)
        
        return(-1 if(result == float('-inf')) else result)