class Solution {
    public int longestValidParentheses(String s) {
        /*
            Time complexity = O(n) - 2 linear traversals, 
            Space complexity = O(1) 
        */
        
        int n = s.length();

        int left = 0, right = n - 1;
        char open = '(', close = ')';

        int lenLongestParantheses = 0, result = 0;
        int openCount = 0, closeCount = 0;

        // Left to Right traversal :-
        while(left < n){ // O(n)
            char sCh = s.charAt(left);
            
            if(sCh == open) openCount++;
            else closeCount++;

            if(openCount == closeCount){
                result = (closeCount + openCount);
                lenLongestParantheses = Math.max(lenLongestParantheses, result);
            }else if(closeCount > openCount){ // Invalid 
                closeCount = 0; // Reset to 0.
                openCount = 0; // Reset to 0.
            }

            left++;
        }

        openCount = 0;
        closeCount = 0;

        // Right to Left traversal :-
        while(right >= 0){ // O(n)
            char sCh = s.charAt(right);
            
            if(sCh == close) closeCount++;
            else openCount++;

            if(openCount == closeCount){
                result = (closeCount + openCount);
                lenLongestParantheses = Math.max(lenLongestParantheses, result);
            }else if(openCount > closeCount){ // Invalid
                closeCount = 0; // Reset to 0.
                openCount = 0; // Reset to 0.
            }

            right--;
        }

        return lenLongestParantheses;
    }
}