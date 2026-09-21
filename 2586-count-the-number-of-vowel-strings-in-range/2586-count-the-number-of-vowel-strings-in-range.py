class Solution:
    def isVowel(self, ch) :
        if ch == 'a' or ch == 'e' or ch == 'i' or ch == 'o' or ch == 'u' :
            return True
        return False 

    def vowelStrings(self, words: list[str], left: int, right: int) -> int :
        '''
            Time complexity = O(right - left + 1) = O(k)
            Space complexity = O(1)
        '''

        n = len(words)
        count_vowel_strings = 0

        for i in range(left, right + 1) :
            word = words[i]
            m = len(word)

            left_ch = word[0]
            right_ch = word[m - 1]

            if(self.isVowel(left_ch) and self.isVowel(right_ch)) :
                count_vowel_strings += 1

        return count_vowel_strings