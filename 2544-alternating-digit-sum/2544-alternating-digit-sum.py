class Solution:
    def alternateDigitSum(self, n: int) -> int:
        '''
            Time complexity = O(log(n)), 
            Space complexity = O(1)
        '''

        isPositive = True
        alter_digit_sum = 0

        digits = int(log10(n) + 1)

        if(digits % 2 == 0) :
            isPositive = False

        while(n > 0) :
            rem = (n % 10)

            alter_digit_sum += rem if(isPositive == True) else (-rem)
            isPositive = not isPositive

            n //= 10
        
        return alter_digit_sum