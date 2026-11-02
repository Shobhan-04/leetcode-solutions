class Solution {
    public boolean isPrime(int num){
        if(num <= 1) return false; 

        for(int i = 2; i * i <= num; i++){ // O(1)
            if(num % i == 0) return false;
        }

        return true;
    }

    public int diagonalPrime(int[][] nums) {
        /*
            Time complexity = O(m x n), 
            Space complexity = O(1)
        */
        
        int m = nums.length, n = nums[0].length;
        int largestPrimeDiagonalNumber = 0;

        for(int i = 0; i < m; i++){ // O(m)
            for(int j = 0; j < n; j++){ // O(n)
                boolean isPrimaryDiagonal = (i == j);
                boolean isSecondaryDiagonal = (j == (n - i - 1));

                if(isPrimaryDiagonal || isSecondaryDiagonal)
                {
                    int val = nums[i][j];

                    if(val > largestPrimeDiagonalNumber && (isPrime(val) == true)){
                        largestPrimeDiagonalNumber = val;
                    }
                }
            }
        }

        return largestPrimeDiagonalNumber;
    }
}