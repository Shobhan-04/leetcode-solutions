class Solution {
    public String robotWithString(String s) {
        /*
            For any index i, its RHS has smaller character present or not.

            Time complexity = O(n) -> because each character is pushed and popped atmost once, 
            Space complexity = O(n) -> Auxilliary space for minCharToRight and StringBuilder.
        */

        int n = s.length();
        char[] minCharToRight = new char[n]; // maintain a suffix array.
        minCharToRight[n-1] = s.charAt(n-1); // store the last character at the last position of the suffix array.

        // Preprocess and find the minimum character to the right :-
        for(int i = (n-2); i >= 0; i--){ // O(n) -> start from the 3rd last character. 
            char sCh = s.charAt(i);
           
            // Store the minimum of character to the right and the current character :
            minCharToRight[i] = (char) Math.min(sCh, minCharToRight[i+1]);
        }        

        int i = 0;

        StringBuilder t = new StringBuilder();
        StringBuilder p = new StringBuilder();

        while(i < n){
            // Remove the first character of a string s and give it to the robot. The robot will append this character to the string t.
            char sCh = s.charAt(i);
            t.append(sCh);
            i++;

            while(t.length() > 0 && (i == n || t.charAt(t.length() - 1) <= minCharToRight[i])){
                // Remove the last character of a string t and give it to the robot.
                int m = t.length();
                char tCh = t.charAt(m - 1);
               
                p.append(tCh); // The robot will write this character on paper.
                t.deleteCharAt(m - 1); // The robot deletes last stored character of string t.
            }
        }

        return p.toString(); // Return the lexicographically smallest string that can be written on the paper.
    }
}