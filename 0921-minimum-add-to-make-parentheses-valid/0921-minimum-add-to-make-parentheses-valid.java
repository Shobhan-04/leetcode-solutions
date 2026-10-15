class Solution {
    public int minAddToMakeValid(String s) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = s.length();

        int openBracketCount = 0; // Counts the no. of open brackets.
        int stackSize = 0; // Calculate the size of the after the element is inserted.

        int i = 0;

        while(i < n){ // O(n)
            char sCh = s.charAt(i);
            char openBracket = '(';

            if(sCh == openBracket) stackSize++;
            else if(stackSize > 0) stackSize--; // Decrement, if encounterd a pair of paranthesis.
            else openBracketCount++; // If closing bracket is encountered.

            i++;
        }

        int minMoves = 0; // Calculate the minimum no. of moves taken to make the string s valid.

        minMoves = (openBracketCount + stackSize);

        return minMoves; // Return the minimum number of moves required to make s valid.
    }
}