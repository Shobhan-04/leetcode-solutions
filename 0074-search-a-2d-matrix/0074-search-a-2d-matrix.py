class Solution:
    def searchMatrix(self, matrix: list[list[int]], target: int) -> bool:
        '''
            Using Binary Search :-
            Time complexity = O(log(m * n)), 
            Space complexity = O(1)
        '''

        rows, cols = len(matrix), len(matrix[0])
        left, right = 0, (rows * cols - 1)

        while(left <= right) :
            mid = left + (right - left) // 2
            n1, n2 = (mid // cols), (mid % cols)
            
            if(matrix[n1][n2] == target) : 
                return True
            
            elif(matrix[n1][n2] > target) :
                right = (mid - 1) # Move towards left.
            
            else :
                left = (mid + 1) # Move towards right.
        
        return False