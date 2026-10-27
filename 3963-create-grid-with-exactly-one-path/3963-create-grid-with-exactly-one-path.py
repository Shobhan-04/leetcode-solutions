class Solution:
    def createGrid(self, m: int, n: int) -> list[str]:
        '''
            Time complexity = O(m * n), 
            Space complexity = O(n) -> Auxilliary space for storing the characters.
        '''

        grid = [] 

        for i in range(m) : # O(m)
            row_ch = ""

            for j in range(n) : # O(n)
                if(i == 0 or j == (n - 1)) :
                    row_ch += '.'
                else :
                    row_ch += '#'
                
            grid.append(row_ch)
        
        return grid