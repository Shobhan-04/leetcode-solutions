class Solution {
    public long numberOfWays(String s) {
        /*
            Intuition :-
                1. If the middle building is '1', the triplet must be "010". That means you need a '0' to its left and a '0' to its right.
                2. If the middle building is '0', the triplet must be "101". That means you need a '1' to its left and a '1' to its right.

            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = s.length();
        long numOfValidWays = 0;
        long totalZeros = 0, totalOnes = 0, leftOnes = 0, leftZeros = 0;

        for(int i = 0; i < n; i++){ // O(n)
            char sCh = s.charAt(i);
           
            if(sCh == '0') totalZeros++;
            if(sCh == '1') totalOnes++;
        }

        for(int i = 0; i < n; i++){ // O(n)
            char sCh = s.charAt(i);

            if(sCh == '1'){ // 0.
                long rightZeros = (totalZeros - leftZeros);
                numOfValidWays += (leftZeros * rightZeros);
                leftOnes++;
            }else if(sCh == '0'){ // 1.
                long rightOnes = (totalOnes - leftOnes);
                numOfValidWays += (leftOnes * rightOnes);
                leftZeros++;
            }
        }

        return numOfValidWays;
    }
}