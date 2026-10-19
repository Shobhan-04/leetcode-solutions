class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        /*
            Time complexity : O(m + n) -> where m and n, are the length of the sentences.
            Space complexity : O(m + n) -> Including the array after the split, HashMap and the uncommonWords resultant list. 
        */
        
        int m = s1.length(), n = s2.length();

        String[] s1Arr = s1.split(" ");
        String[] s2Arr = s2.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        // Add the splitted String array elements of s1 into the HashMap.
        for(String word1 : s1Arr){
            map.put(word1, map.getOrDefault(word1, 0) + 1);    
        }

        // Add the splitted String array elements of s2 into the HashMap.
        for(String word2 : s2Arr){
            map.put(word2, map.getOrDefault(word2, 0) + 1);    
        }

        List<String> uncommonWords = new ArrayList<>();

        // Extract the entry from the map :-
        // A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence :-
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            String key = entry.getKey(); // get the key.
            int val = entry.getValue(); // get the value.

            if(val == 1){ // Add the key into the uncommonWords list if the value is 1.
                uncommonWords.add(key);
            }
        }

        // Given two sentences s1 and s2, return a list of all the uncommon words.
        return uncommonWords.toArray(new String[0]);
    }
}