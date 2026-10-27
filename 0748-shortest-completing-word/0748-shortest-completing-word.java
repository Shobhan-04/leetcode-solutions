class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        /*
            Time complexity = O(m + n * (k + 26)) = O(m + n * k), 
            Space complexity = O(26) = O(1)
        */
        
        int m = licensePlate.length(), n = words.length;
        String minCompletingWord = "";
        
        int[] freqLicensePlate = new int[26];

        // Extract the required letters: Convert licensePlate to lowercase
        licensePlate = licensePlate.toLowerCase();

        for(int i = 0; i < m; i++){ // O(m)
            char licensePlateCh = licensePlate.charAt(i);
            
            // ignore digits and spaces :-
            if(licensePlateCh >= 'a' && licensePlateCh <= 'z'){
                /*
                Count how many times each letter appears.
                    - Example: "aBc 12c" → a: 1, b: 1, c: 2 
                */
                freqLicensePlate[licensePlateCh - 'a']++;
            }
        }

        for(int i = 0; i < n; i++){ // O(n)
            // Check each word: Convert each word to lowercase and count its letters.
            String word = words[i].toLowerCase();
            int k = word.length();
            
            // Maintain a dynamic frequency array for storing the words :-
            int[] freqWords = new int[26];

            for(int j = 0; j < k; j++){ // O(k)
                char wordCh = word.charAt(j);
                freqWords[wordCh - 'a']++;
            }

            boolean isCompletingWord = true; // Initially true

            for(int l = 0; l < 26; l++){ // O(26) = O(1)
                if(freqWords[l] < freqLicensePlate[l]){
                    // A word is completing if its frequency for every required letter is greater than or equal to the required frequency.
                    isCompletingWord = false;
                    break;
                }
            }
            
            //  Find the shortest word: Among all completing words, select the one with the smallest length.
            if(isCompletingWord && (minCompletingWord.isEmpty() || k < minCompletingWord.length()))
            {
                // Preserve the first occurrence: Update the answer only when a strictly shorter completing word is found. If another word has the same length, keep the earlier one.
                minCompletingWord = words[i];
            }

        }

        return(minCompletingWord);
    }
}