class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        /*
            Time complexity = O(m x n),
            Space complexity = O(m + n)
        */
        
        int m = matrix.length, n = matrix[0].length;

        List<Integer> result = new ArrayList<>();
        
        int[] rowMin = new int[m];
        Arrays.fill(rowMin, Integer.MAX_VALUE);

        int[] colMax = new int[n];
        Arrays.fill(colMax, Integer.MIN_VALUE);

        int row = 0, col = 0;

        while(row < m){ // O(m)
            while(col < n){ // O(n)
                rowMin[row] = Math.min(rowMin[row], matrix[row][col]);
                colMax[col] = Math.max(colMax[col], matrix[row][col]);

                col++;
            }

            row++;
            col = 0;
        }

        row = 0;
        col = 0;

        while(row < m){ // O(m)
            while(col < n){ // O(n)
                int value = matrix[row][col];
                if(value == rowMin[row] && value == colMax[col]){
                    result.add(value);
                }

                col++;
            }

            row++;
            col = 0;
        }

        return result;
    }
}