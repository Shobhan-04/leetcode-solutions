class Solution:
    def isAcronym(self, words: List[str], s: str) -> bool:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        m, n = len(words), len(s)

        if(m != n) : # Base case
            return False

        for i in range(n) :
            word = words[i] # Extracting the particular word from the words list.
            word_first_ch = word[0] # Get the first character of the word and store it.
            s_ch = s[i] # Get the i-th index of the string s.

            # Compare the i-th character of the string s, with the 0th character of the word :-
            if(not (word_first_ch == s_ch)) :
                return False
        
        return True