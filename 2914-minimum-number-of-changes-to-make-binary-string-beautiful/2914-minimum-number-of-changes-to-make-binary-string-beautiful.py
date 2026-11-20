class Solution:
    def minChanges(self, s: str) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(s)
        minimum_number_of_changes = 0

        for i in range(0, n, 2) :  # O(n)
           if(s[i] != s[i+1]) :
            minimum_number_of_changes += 1

        return minimum_number_of_changes