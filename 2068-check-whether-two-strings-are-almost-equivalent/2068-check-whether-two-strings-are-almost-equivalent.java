class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        /*
            Time complexity = O(n + 26) = O(n), 
            Space complexity = O(26) = O(1)
        */
        
        int n = word1.length();
        n = word2.length();
        int[] freq = new int[26];

        for(int i = 0; i < n; i++){ // O(n)
            char word1Ch = word1.charAt(i);
            char word2Ch = word2.charAt(i);
            freq[word1Ch - 'a']++; // Adding the frequency of the particular character in word1.
            freq[word2Ch - 'a']--; // Subtracting the frequency of the particular character in word2.
        }

        for(int i = 0; i < 26; i++){ // O(26)
            int value = Math.abs(freq[i]); // Storing the resultant difference of both word1 and word2.

            if(value > 3) return false; // return false if word1 and word2 are not almost equivalent,
        }

        return true; // return true if word1 and word2 are almost equivalent,
    }
}