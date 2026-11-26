class Solution {
    public int maxScore(String s) {
        /*
            Time complexity = O(n^2), 
            Space complexity = O(1)
        */
        
        int n = s.length();
        int maxScore = Integer.MIN_VALUE;

        for(int i = 0; i <= (n - 2); i++){
            int zeroCount = 0;

            for(int j = 0; j <= i; j++){ // j -> 0 to i.
                if(s.charAt(j) == '0') zeroCount++;
            }

            int oneCount = 0;

            for(int k = (i + 1); k < n; k++){ // k -> (i + 1) to (n - 1).
                if(s.charAt(k) == '1') oneCount++;
            }
            
            maxScore = Math.max(maxScore, (oneCount + zeroCount));
        }

        return(maxScore);
    }
}