class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int m = widths.length, n = s.length();
        int[] result = new int[2];
        int totalNumOfLines = 1, lastLineWidth = 0;

        for(int i = 0; i < n; i++){ // O(n)
           char sCh = s.charAt(i);
           int currWidth = widths[sCh - 'a'];

            if((currWidth + lastLineWidth) > 100){
                totalNumOfLines++;
                lastLineWidth = 0; //Reset the lastLinewidth after moving to the next line
            }

            // Accumulate the currWidth in each and every iteration :-
            lastLineWidth += currWidth;
        }

        result[0] = totalNumOfLines;
        result[1] = lastLineWidth;

        return(result);
    }
}