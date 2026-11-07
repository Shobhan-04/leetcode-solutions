class Solution:
    def countWords(self, words1: list[str], words2: list[str]) -> int:
        '''
            Time complexity = O(m + n), 
            Space complexity = O(m) -> Auxilliary space for storing unique words from words1 into count_dict.
        '''

        m, n = len(words1), len(words2)
        count_dict = dict()

        for i in range(m) : # O(m)
            word1 = words1[i]
            count_dict[word1] = count_dict.get(word1, 0) + 1
        
        for i in range(n) : # O(n)
            word2 = words2[i]

            if(word2 in count_dict) :
                state = count_dict.get(word2)

                if(state == 1) :
                    count_dict[word2] = 0
                elif(state == 0) :
                    count_dict[word2] = -1

        common_words_occurence_count = 0

        for value in count_dict.values() :
            if(value == 0) : 
                common_words_occurence_count += 1
        
        return common_words_occurence_count