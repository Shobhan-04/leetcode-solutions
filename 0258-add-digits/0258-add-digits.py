class Solution:
    def addDigits(self, num: int) -> int:
        '''
            Time complexity = O(log(n)), 
            Space complexity = O(1)
        '''

        remainder = 0

        while(num >= 10) : # Checking until the num has two digits

            # Extracting the last digits of the num and add it to the digits_sum :-
            digits_sum = 0

            while(num != 0) :
                remainder = (num % 10)
                digits_sum += remainder
                num //= 10
            
            num = digits_sum # re-initialize digits_sum as num, to repeatedly add all its digits until the result has only one digit.

        return num # return the num containing only one digit.
