class Solution {
    public boolean checkInclusion(String s1, String s2) {
        /*
            Time complexity = O(26) = O(1), 
            Space complexity = O(n)
        */
        
        int m = s1.length(), n = s2.length();

        // Base condition : If m is greater than n, then return false.
        if(m > n) return false;

        char[] s1Arr = s1.toCharArray(); // Convert the s1 into character array.

        Arrays.sort(s1Arr); // Sort the character array s1Arr.

        // Check substring of length m :-
        for(int i = 0; i <= n - m; i++){ // Iterate over the difference of the character that are in s1 and whose permutation exists in s2.

            int start = i, end = (i + m);
            String substring = s2.substring(start, end); // Get the substring of s2.
            
            char[] subStringArr = substring.toCharArray();
            Arrays.sort(subStringArr);

            // Compare sorted arrays :-
            if(Arrays.equals(s1Arr, subStringArr)) return true; 
        }

        return false;
    }
}