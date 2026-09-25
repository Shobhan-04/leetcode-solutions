class Solution:
    def isGoodNumber(self, num) -> bool :
        change_possible = False

        while(num > 0) :
            digit = (num % 10)

            if(digit == 3 or digit == 4 or digit == 7) :
                return False
            
            if(digit == 2 or digit == 5 or digit == 6 or digit == 9) :
                change_possible = True
            
            num //= 10
        
        return change_possible

    def rotatedDigits(self, n: int) -> int:
        i, countGoodNumber = 1, 0

        while(i <= n) :
            if(self.isGoodNumber(i)) :
                countGoodNumber += 1
            i += 1

        return countGoodNumber