class Solution:
    def isVowel(self, ch) :
        return(ch == 'a' or ch == 'e' or ch == 'i' or ch == 'o' or ch == 'u')

    def beautifulSubstrings(self, s: str, k: int) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        beautiful_substrings_count = 0
        n = len(s)

        for i in range(0, n) : # O(n)
            consonants, vowels = 0, 0

            for j in range(i, n) : # O(n)
                sCh = s[j]

                if(self.isVowel(sCh)) :
                    vowels += 1
                else :
                    consonants += 1
                
                if(vowels == consonants and (vowels * consonants) % k == 0) :
                    beautiful_substrings_count += 1
        
        return beautiful_substrings_count
