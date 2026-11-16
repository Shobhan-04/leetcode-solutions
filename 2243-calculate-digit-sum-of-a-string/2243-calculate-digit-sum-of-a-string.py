class Solution:
    def digitSum(self, s: str, k: int) -> str:
        '''
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for result_str, s having length as n.
        '''

        n = len(s)
        result_str = ""

        i = 0

        while(n > k) :
            i = 0
            result_str = ""

            while(i < n) :
                j = i
                sum_of_digits = 0

                while(j < (i + k) and j < n) :
                    s_ch = s[j]
                    digit = int(s_ch)
                    sum_of_digits += digit

                    j += 1
                
                result_str += str(sum_of_digits)

                i += k
            
            s = result_str
            n = len(s)
        
        return s