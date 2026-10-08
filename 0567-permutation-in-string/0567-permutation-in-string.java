class Solution {
    public boolean checkInclusion(String s1, String s2) {
        /*
            Time complexity = O(26) = O(1), 
            Space complexity = O(n)
        */
        
        int m = s1.length(), n = s2.length();

        // Base condition : If m is greater than n, then return false.
        if(m > n) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26]; 

        // Store characters of s1 in the freq1 :-
        for(int i = 0; i < m; i++){
            char s1Ch = s1.charAt(i);
            freq1[s1Ch - 'a']++;
        }

        // Store character of s2 in freq2 :-
        for(int i = 0; i < m; i++){
            char s2Ch = s2.charAt(i);
            freq2[s2Ch - 'a']++;
        }

        // Check first freq1 equals with freq2 :-
        if(Arrays.equals(freq1, freq2)) return true;

        // Slide the window :-
        for(int i = m; i < n; i++){
            char s2Ch = s2.charAt(i);
            char s2Ch_m = s2.charAt(i-m);

            freq2[s2Ch - 'a']++; // Add the new character.
            freq2[s2Ch_m - 'a']--; // Remove the old character.

            if(Arrays.equals(freq1, freq2)) return true;
        }

        return false;
    }
}