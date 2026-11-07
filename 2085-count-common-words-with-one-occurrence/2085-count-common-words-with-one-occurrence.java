class Solution {
    public int countWords(String[] words1, String[] words2) {
        /*
            TIme complexity = O(m + n), 
            Space complexity = O(m + n)
        */
        
        int m = words1.length, n = words2.length;
        HashMap<String, Integer> countMap1 = new HashMap<>();
        HashMap<String, Integer> countMap2 = new HashMap<>();

        int commonOccurenceWordsCount = 0;

        // Store the frequencies of words1 in countMap1 :-
        for(int i = 0; i < m; i++){ // O(m)
            String word1 = words1[i];
            countMap1.put(word1, countMap1.getOrDefault(word1, 0) + 1);
        }

        // Store the frequencies of words2 in countMap2 :-
        for(int i = 0; i < n; i++){ // O(n)
            String word2 = words2[i];
            countMap2.put(word2, countMap2.getOrDefault(word2, 0) + 1);
        }

        // Loop throught each word in the map :-
        for(Map.Entry<String, Integer> entry : countMap1.entrySet()){
            String word = entry.getKey();
            int freq = entry.getValue();

            // Check its occurence in both the map, if it appears for exactly once in both the arrays then, increment the count :-
            if((countMap1.get(word) == 1) && (countMap2.getOrDefault(word, 0) == 1)){
                commonOccurenceWordsCount++;
            }
        }

        // return the number of strings that appear exactly once in each of the two arrays :-
        return commonOccurenceWordsCount;
    }
}