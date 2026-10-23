class Solution {
    public int countCharacters(String[] words, String chars) {
        /*
            Time comlexity = O(n * (m + 26)) = O(n * m) where m is the length of each word, 
            Space complexity = O(1) for the frequency array of size 26.
        */
        
        int n = words.length;
        int[] charCount = new int[26]; // O(26) = O(1)

        // Store the frequency of characters for the given string "chars" :-
        for(char charsCh : chars.toCharArray()){
            charCount[charsCh - 'a']++;
        }

        int sumLenGoodStrings = 0;

        for(int i = 0; i < n; i++){ // O(n)
            String word = words[i];
            int m = word.length();
            
            int[] wordCount = new int[26]; // Dynamic frequency array for storing the frequency of character of the word.

            for(int j = 0; j < m; j++){ // O(m)
                char wordCh = word.charAt(j);
                wordCount[wordCh - 'a']++;
            }

            boolean isGoodString = true;

            for(int k = 0; k < 26; k++){ // O(26)
                if(wordCount[k] > charCount[k]){
                    isGoodString = false;
                    break;
                }
            }

            if(isGoodString == true){
                sumLenGoodStrings += m;
            }
        } 

        return(sumLenGoodStrings);
    }
}