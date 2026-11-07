class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        /*
            Time complexity = O(m * n), 
            Space complexity = O(m * n) -> Including the auxilliary space for the resultant array.
        */
        
        int m = rowSum.length, n = colSum.length;
        int[][] result = new int[m][n];
        int minValue = Integer.MAX_VALUE;
        
        for(int i = 0; i < m; i++){ // O(m)
            for(int j = 0; j < n; j++){ // O(n)
                minValue = Math.min(rowSum[i], colSum[j]); // Get the minimum out of the rowSum and the colSum.
                result[i][j] = minValue; // Store that minValue as the first element into the result, in order to poupulate with the othe elements.

                rowSum[i] -= minValue; // subtract the minValue from the particular row of rowSum.
                colSum[j] -= minValue; // subtract the minValue from the particular column of colSum.
            }
        }

        return(result); // Return a 2D array representing any matrix that fulfills the requirements. It's guaranteed that at least one matrix that fulfills the requirements exists.
    }
}