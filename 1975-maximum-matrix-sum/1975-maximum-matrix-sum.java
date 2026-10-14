class Solution {
    public long maxMatrixSum(int[][] matrix) {
        /*
            Negative nos. occuring for odd no. of times then, try to make the smallest no. as -ve.
            Negative nos. occuring for even no. of times then, all becomes positive eventually.

            Time complexity = O(n^2), 
            Space complexity = O(1) 
        */
        
        int n = matrix.length;

        int i = 0;

        long maxSumMatrix = 0;
        int smallestNo = Integer.MAX_VALUE;
        int negativesCount = 0;

        while(i < n){ // O(n)
            int j = 0;
            while(j < n){ // O(n)
                maxSumMatrix += Math.abs(matrix[i][j]);

                if(matrix[i][j] < 0){
                    negativesCount++;
                }

                smallestNo = Math.min(smallestNo, Math.abs(matrix[i][j]));

                j++;
            }

            i++;
        }

        if(negativesCount % 2 == 0){ // even number of negative numbers.
            return maxSumMatrix;
        }

        // odd number of negative numbers.
        return maxSumMatrix - (2 * smallestNo);
    }
}