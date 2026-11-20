class Solution:
    def minChanges(self, s: str) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(s)
        count, minimum_number_of_changes = 0, 0
        curr_ch = s[0]

        for i in range(n) :  # O(n)
            s_ch = s[i]

            if(s_ch == curr_ch) :
                count += 1
                continue
            
            # if s_ch != curr_ch :

            if(count % 2 == 0) :
                count = 1
            else :
                minimum_number_of_changes += 1
                count = 0
            
            curr_ch = s[i]

        return minimum_number_of_changes