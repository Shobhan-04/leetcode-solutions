class Solution:
    def shortestCompletingWord(self, licensePlate: str, words: list[str]) -> str:
        '''
            Time complexity = O(m + n * (k + 26)) = O(m + n * k), 
            Space complexity = O(1)
        '''

        m, n = len(licensePlate), len(words)
        freqLicensePlate = [0] * 26
        min_completing_word = ""
        licensePlate = licensePlate.lower()

        i = 0

        while(i < m) :
            licensePlate_ch = licensePlate[i] 
            
            if(licensePlate_ch >= 'a' and licensePlate_ch <= 'z') :
                freqLicensePlate[ord(licensePlate_ch) - ord('a')] += 1
            
            i += 1
        
        i = 0

        while(i < n) :
            word = words[i].lower()
            k = len(word)

            j = 0
            freqWords = [0] * 26

            while(j < k) :
                word_ch = word[j]
                freqWords[ord(word_ch) - ord('a')] += 1

                j += 1
            
            l = 0
            is_completing_word = True
            while(l < 26) :
                if(freqWords[l] < freqLicensePlate[l]) :
                    is_completing_word = False

                l += 1
            
            if(is_completing_word and (not min_completing_word or k < len(min_completing_word))) :
                min_completing_word = words[i]

            i += 1
        
        return(min_completing_word)

            