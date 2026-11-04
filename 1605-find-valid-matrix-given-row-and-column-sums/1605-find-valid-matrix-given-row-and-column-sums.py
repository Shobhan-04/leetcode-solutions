class Solution:
    def restoreMatrix(self, rowSum: list[int], colSum: list[int]) -> list[list[int]]:
        '''
            Time complexity = O(m * n), 
            Space complexity = O(m * n) -> Including the auxilliary space for the resultant array.
        '''

        m, n = len(rowSum), len(colSum)
        result = [[0] * n for i in range(m)]
        min_value = float('inf')

        for i in range(m) : # O(m)
            for j in range(n) : # O(n)
                min_value = min(rowSum[i], colSum[j])
                result[i][j] = min_value

                rowSum[i] -= min_value
                colSum[j] -= min_value
        
        return result