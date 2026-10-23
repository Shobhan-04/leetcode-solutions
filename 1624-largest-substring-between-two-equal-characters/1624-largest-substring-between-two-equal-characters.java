class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        /*
            Optimal approach :-
                Time complexity = O(n), 
                Space complexity = O(26) = O(1)
        */
        
        int n = s.length();
        int[] freq = new int[26]; // Constant space sized frequency array.
        Arrays.fill(freq, -1); // Initially, fill the entire array with the value as -1.

        int result = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){ // O(n)
            char sCh = s.charAt(i);
            
            // If freq doesn't contains that character :
            if(freq[sCh - 'a'] == -1) freq[sCh - 'a'] = i; // then, add that character.
            
            // result stores the length of the longest substring between two equal characters, excluding the two characters.
            else result = Math.max(result, i - freq[sCh - 'a'] - 1);
        }        

        // return the length of the longest substring between two equal characters, excluding the two characters. If there is no such substring return -1.
        return result == Integer.MIN_VALUE ? -1 : result;
    }
}