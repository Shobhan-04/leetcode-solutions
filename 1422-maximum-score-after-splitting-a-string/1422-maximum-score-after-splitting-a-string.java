class Solution {
    public int maxScore(String s) {
        /*
            Optimal approach :-
                score = (leftZeros + rightOnes) -> Given
                    totalOnes = (leftOnes + rightOnes)
                    => rightOnes = (totalOnes - leftOnes)
                => score = (leftZeros + (totalOnes - leftOnes))
                => score = (leftZeros - leftOnes) + totalOnes

                Time complexity = O(n + n) = O(2 * n) = O(n), 
                Space complexity = O(1)
        */
        
        int n = s.length();
        int maxScore = Integer.MIN_VALUE;
        int totalOnes = 0, leftOnes = 0, leftZeros = 0;

        for(int i = 0; i < n; i++){ // O(n)
            if(s.charAt(i) == '1') totalOnes++;
        }

        for(int i = 0; i <= (n - 2); i++){ // O(n)
            if(s.charAt(i) == '1') leftOnes++;
            else leftZeros++;

            maxScore = Math.max(maxScore, (leftZeros - leftOnes));
        }

        return(maxScore + totalOnes);
    }
}