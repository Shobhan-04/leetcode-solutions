class Solution {
    public int maxProduct(String[] words) {
        /*
            Time complexity = O(N + L^2),
            Space complexity = O(N)
        */
        
        int n = words.length;
        int[] freq = new int[n];
        Arrays.fill(freq, 0);

        int result = 0;

        for(int i = 0; i < n; i++){
            String word = words[i];
            int m = word.length();

            for(int j = 0; j < m; j++){
                char wordCh = word.charAt(j);
                freq[i] |= 1 << (wordCh - 'a'); // Bitmask array using the Bit-manipulation.
            }

            for(int k = 0; k < i; k++){
                String word1 = words[k];
                int p = word1.length();

                if((freq[i] & freq[k]) == 0){ // no common letter exists
                    // return the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters.
                    if(m * p > result) result = (m * p);
                }
            }
        }

        return result == 0 ? 0 : result; // If no such two words exist, return 0.
    }
}