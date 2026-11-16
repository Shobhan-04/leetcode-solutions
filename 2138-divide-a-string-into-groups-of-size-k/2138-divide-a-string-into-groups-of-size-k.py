class Solution:
    def divideString(self, s: str, k: int, fill: str) -> list[str]:
        '''
            Time complexity = O(n + k), 
            Space complexity = O(n + k) -> Auxilliary space for the temp string and by including the result list.
        '''

        n = len(s)
        result_length = (n + k - 1) // k
        result = [None] * result_length

        i, res_idx = 0, 0

        while(i < n) :
            j = i
            temp = "" # reset

            # The first group consists of the first k characters of the string, the second group consists of the next k characters of the string, and so on. Each element can be a part of exactly one group :-
            while(j < (i + k) and j < n) :
                s_ch = s[j]
                temp += s_ch

                j += 1
            
            # For the last group, if the string does not have k characters remaining, a character fill is used to complete the group :-
            while(len(temp) < k) :
                temp += fill

            # The partition is done so that after removing the fill character from the last group (if it exists) and concatenating all the groups in order, the resultant string should be s :-
            result[res_idx] = temp
            res_idx += 1 

            i += k
    
        return result # return a string array denoting the composition of every group s