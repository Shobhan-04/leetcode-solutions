class Solution {
    public boolean rotateString(String s, String goal) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n)
        */
        
        int m = s.length();
        int n = goal.length();

        if(m != n) return false; // Base condition

        String concatString = (s + s); // stores the concatenated string.

        // Check whether goal is present as a substring in concatString :-
        if(concatString.contains(goal)) return true; // then, return true.

        // Otherwise, return false :-
        return false;
    }
}