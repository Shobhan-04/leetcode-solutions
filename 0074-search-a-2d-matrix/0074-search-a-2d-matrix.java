class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /*
            Using Binary Search Approach :-
                Time complexity = O(log(m * n)), 
                Space complexity = O(1)
        */
        
        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = (rows * cols - 1);

        while(left <= right){
            int mid = right + (left - right) / 2;
            int row = (mid / cols), col = (mid % cols);

            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] > target) right = (mid - 1); // Move towards left.
            else left = (mid + 1); // Move towards right.
        }

        return false;
    }
}