class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        /*
            Optimized approach :-
            
            Time complexity = O(m x n),
            Space complexity = O(1)
        */
        
        int m = matrix.length, n = matrix[0].length;

        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0;

        while(i < m){ // O(m)
            int minCol = 0;
            
            while(j < n){ // O(n)
                if(matrix[i][j] < matrix[i][minCol]) minCol = j;
               
                j++;
            }

             int k = 0, value = matrix[i][minCol];
            boolean isLuckyNumber = true;

            while(k < m){ // O(m)
                if(matrix[k][minCol] > value){
                    isLuckyNumber = false;
                    break;
                } 

                k++;
            }

            if(isLuckyNumber == true) result.add(value);

            i++;
            j = 0;
        }

        return result;
    }
}