class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        /*
            Time complexity = O(m) + O(n * k), 
            Space complexity = O(n)
        */
        
        int m = allowed.length(), n = words.length;
        int consistentStringCount = 0;
        HashSet<Character> set = new HashSet<>(); // O(n)

        // Storing the characters of "allowed" into the set :-
        for(int i = 0; i < m; i++){ // O(m)
            char allowedCh = allowed.charAt(i);
            set.add(allowedCh);
        }

        for(int i = 0; i < n; i++){ // O(n)
            String word = words[i];
            int k = word.length();

            boolean isConsistent = true; // A string is consistent if all characters in the string appear in the string allowed.

            for(int j = 0; j < k; j++){ // O(k)
                char wordCh = word.charAt(j);

                // If set doesn't contains the wordCh then set isConsistent to false :-
                if(!set.contains(wordCh)){
                    isConsistent = false;
                }
            }

            // If the string is a consistent string then, increment the consistentStringCount :-
            if(isConsistent == true) consistentStringCount++;
        }   

        return consistentStringCount; // Return the number of consistent strings in the array words.
    }
}