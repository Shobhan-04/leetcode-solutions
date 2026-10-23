class Solution:
    def countCharacters(self, words: list[str], chars: str) -> int:
        '''
            Time comlexity =  O(C + W * (M + 26)) = O(C * WM) where C be the length of chars, W the number of words, and M the maximum word length, 
            Space complexity = O(1) for the frequency array of size 26.
        '''

        n = len(words)
        char_count = [0] * 26

        for chars_ch in chars :
            char_count[ord(chars_ch) - ord('a')] += 1
        
        sum_len_good_strings = 0

        for i in range(n) :
            word = words[i]
            m = len(word)
            word_count = [0] * 26

            for j in range(m) :
                word_ch = word[j]
                word_count[ord(word_ch) - ord('a')] += 1

            is_good_string = True

            for k in range(26) :
                if(word_count[k] > char_count[k]) :
                    is_good_string = False
                    break
            
            if(is_good_string == True) :
                sum_len_good_strings += m
        
        return sum_len_good_strings