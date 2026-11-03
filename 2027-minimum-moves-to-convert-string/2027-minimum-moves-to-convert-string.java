class Solution {
    public int minimumMoves(String s) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = s.length();
        int minMovesConversion = 0;

        int i = 0;

        while(i < n){ // O(n)
            char sCh = s.charAt(i);
            
            if(sCh == 'X'){
                minMovesConversion++;
                i += 3;
            }

            else i++;
        }

        return minMovesConversion; // Return the minimum number of moves required so that all the characters of s are converted to 'O'.
    }
}