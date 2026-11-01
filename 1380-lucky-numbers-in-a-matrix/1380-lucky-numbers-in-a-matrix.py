class Solution:
    def luckyNumbers(self, matrix: list[list[int]]) -> list[int]:
        '''
            Time complexity = O(m x n),
            Space complexity = O(1)
        '''

        m, n = len(matrix), len(matrix[0])

        i, j = 0, 0

        result = []

        while(i < m) :
            min_col_value = 0

            while(j < n) :
                if(matrix[i][j] < matrix[i][min_col_value]) :
                    min_col_value = j

                j += 1
            
            value = matrix[i][min_col_value]
            is_lucky_number = True
            k = 0

            while(k < m) :
                if(matrix[k][min_col_value] > value) :
                    is_lucky_number = False
                    break

                k += 1
            
            if(is_lucky_number == True) :
                result.append(value)

            i += 1
            j = 0
        
        return result