class Solution {
    public boolean checkZeroOnes(String s) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = s.length();
        int currentOnes = 0, currentZeros = 0;
        int maxOnes = 0, maxZeros = 0;

        for(int i = 0; i < n; i++){ // O(n)
            char sCh = s.charAt(i);

            if(sCh == '1'){
                currentOnes++;
                currentZeros = 0; // Re-intialize bcoz the current segment of 1's broke.
                maxOnes = Math.max(maxOnes, currentOnes);
            }

            if(sCh == '0'){
                currentZeros++;
                currentOnes = 0; // Re-initialize bcoz the current segment of 1's broke.
                maxZeros = Math.max(maxZeros, currentZeros);
            }
        }

        if(maxOnes > maxZeros) return true;

        return false;
    }
}