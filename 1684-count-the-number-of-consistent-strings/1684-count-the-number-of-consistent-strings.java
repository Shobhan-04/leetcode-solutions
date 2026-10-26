class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        /*
            5. If all characters are true, increment the count.
            
            Time complexity = O(m) + O(n * k), 
            Space complexity = O(1)
        */
        
        int m = allowed.length(), n = words.length;
        int consistentStringCount = 0;

        // 1. Create boolean[26], initially all false.
        boolean[] freq = new boolean[26]; // O(26) = O(1)
        Arrays.fill(freq, false);

        // 2. Traverse allowed and mark each allowed character's index as true :-
        for(int i = 0; i < m; i++){ // O(m)
            int allowedIdx = allowed.charAt(i) - 'a';
            freq[allowedIdx] = true;
        }

        // 3. Traverse every word and check its characters :-
        for(int i = 0; i < n; i++){ // O(n)
            String word = words[i];
            int k = word.length();

            boolean isConsistent = true; // A string is consistent if all characters in the string appear in the string allowed.

            for(int j = 0; j < k; j++){ // O(k)
                int wordIdx = word.charAt(j) - 'a';

                // 4. If any character maps to false, the word is inconsistent.
                if(freq[wordIdx] == false){
                    isConsistent = false;
                }
            }

            // If the string is a consistent string then, increment the consistentStringCount :-
            if(isConsistent == true) consistentStringCount++;
        }   

        return consistentStringCount; // Return the number of consistent strings in the array words.
    }
}