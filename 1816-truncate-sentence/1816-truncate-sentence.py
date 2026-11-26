class Solution:
    def truncateSentence(self, s: str, k: int) -> str:
        '''
            Time complexity = O(k), 
            Space complexity = O(n)
        '''

        s_list = s.split(" ")
        n = len(s_list)
        result = ""
        index = 0

        while(k > 0) :
            word = s_list[index]
            result += (word + " ")
            index += 1
            k -= 1

        return(result.strip())