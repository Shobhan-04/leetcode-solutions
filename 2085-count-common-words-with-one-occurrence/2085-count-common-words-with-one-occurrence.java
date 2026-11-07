class Solution {
    public int countWords(String[] words1, String[] words2) {
        /*
            TIme complexity = O(m + n), 
            Space complexity = O(n)
        */
        
        int m = words1.length, n = words2.length;
        HashMap<String, Integer> countMap = new HashMap<>();

        int commonOccurenceWordsCount = 0;

        // Store the frequencies of words1 in countMap :-
        for(int i = 0; i < m; i++){ // O(m)
            String word1 = words1[i];
            countMap.put(word1, countMap.getOrDefault(word1, 0) + 1);
        }

        // Track matching frequencies from words2 using state numbers :-
        for(int i = 0; i < n; i++){ // O(n)
            String word2 = words2[i];
            
            if(countMap.containsKey(word2)){
                int state = countMap.get(word2);

                // Word occured exactly once in both the String arrays :-
                if(state == 1) countMap.put(word2, 0);

                // Word occured multiple times in the String arrays so, disqualified :-
                else if(state == 0) countMap.put(word2, -1);
            }
        }

        // Words occured once in the map with value as 0 then, increment the count :-
        for(int value : countMap.values()){
            if(value == 0) commonOccurenceWordsCount++;
        }

        // return the number of strings that appear exactly once in each of the two arrays :-
        return commonOccurenceWordsCount;
    }
}