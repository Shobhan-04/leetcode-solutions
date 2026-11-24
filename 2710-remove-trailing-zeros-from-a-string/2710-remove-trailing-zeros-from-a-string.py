class Solution:
    def removeTrailingZeros(self, num: str) -> str:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(num)
        i = (n - 1)

        while(i >= 0) :
            num_ch = num[i]
            if(num_ch != '0') :
                break

            i -= 1
        
        return(num[0 : i + 1])