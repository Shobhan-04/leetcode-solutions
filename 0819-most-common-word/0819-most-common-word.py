class Solution:
    def mostCommonWord(self, paragraph: str, banned: list[str]) -> str:
        '''
            Time complexity = O(m + n), 
            Space complexity = O(n)
        '''

        m, n = len(paragraph), len(banned)
        paragraph = paragraph.lower()

        for punct_ch in "!,;?'." :
            paragraph = paragraph.replace(punct_ch, " ")

        freq_dict = dict()
        banned_set = set(word.lower() for word in banned)
        paragraph_lst = paragraph.split()

        for word in paragraph_lst :
            if word not in banned_set :
                freq_dict[word] = freq_dict.get(word, 0) + 1
            
        most_freq_word = ""
        max_value = 0

        for key, value in freq_dict.items() :
            if(value > max_value) :
                max_value = value
                most_freq_word = key
        
        return most_freq_word