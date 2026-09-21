class Solution:
    def largestGoodInteger(self, num: str) -> str:
        '''
            Time complexity = O(n) 
            Space complexity = O(1)
        '''

        n = len(num)
        result = ""

        left, right = 0, 2

        while(right < n) :
            if num[left] == num[left+1] and \
            num[left+1] == num[left+2] and \
            num[left+2] == num[left] :

                if result == "" or num[left] > result[0] :
                    result = num[left] * 3 # string concatenation.
            
            left += 1
            right += 1
        
        return result