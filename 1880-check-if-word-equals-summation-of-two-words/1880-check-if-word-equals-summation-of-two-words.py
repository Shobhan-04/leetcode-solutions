class Solution:
    def getNumericValue(self, s: str) -> int:
        num, n = 0, len(s)

        for i in range(n) :
            s_ch = s[i]
            digit = (ord(s_ch) - ord('a'))
            num = (num * 10) + digit
        
        return(num)

    def isSumEqual(self, firstWord: str, secondWord: str, targetWord: str) -> bool:
        '''
            Time complexity = O(m+n+t) -> m, n, and t are the length of firstWord, secondWord, and targetWord respectively.

            Space complexity = O(1) 
        '''

        first_int = self.getNumericValue(firstWord)
        second_int = self.getNumericValue(secondWord)
        target_int = self.getNumericValue(targetWord)

        return((first_int + second_int) == target_int)