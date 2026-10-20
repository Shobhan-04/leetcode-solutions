class Solution:
    def addStrings(self, num1: str, num2: str) -> str:
        '''
            Time complexity = O(m + n), 
            Space complexity = O(n)
        '''

        m, n = len(num1), len(num2)
        i, j, carry = (m-1), (n-1), 0

        sb = []
        result = ""

        while(i >= 0 or j >= 0 or carry > 0) :
            digit1, digit2 = 0, 0

            if(i >= 0) :
                num1_ch = num1[i]
                digit1 = (ord(num1_ch) - ord('0')) 
                i -= 1
            
            if(j >= 0) :
                num2_ch = num2[j]
                digit2 = (ord(num2_ch) - ord('0')) 
                j -= 1
            
            add_strings = (digit1 + digit2 + carry)
            carry = (add_strings // 10)
            last_digit = (add_strings % 10)
            sb.append(str(last_digit))
    
        return "".join(reversed(sb))
