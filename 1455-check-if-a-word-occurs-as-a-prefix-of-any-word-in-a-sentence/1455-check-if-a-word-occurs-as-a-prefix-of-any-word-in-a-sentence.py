class Solution:
    def isPrefixOfWord(self, sentence: str, searchWord: str) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        if(sentence == None or searchWord == None) :
            return -1
        
        sentence_arr = sentence.split(" ")
        n = len(sentence_arr)

        i = 0

        while(i < n) : # O(n)
            word = sentence_arr[i]

            if(word.startswith(searchWord)) :
                return(i + 1)
            
            i += 1
        
        return -1