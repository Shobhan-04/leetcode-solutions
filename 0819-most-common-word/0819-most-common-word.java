class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        /*
            Time complexity = O(n + m), 
            Space complexity = O(n) -> Auxilliary space for HashMap and HashSet.
        */
        
        int n = banned.length;
        paragraph = paragraph.toLowerCase(); // lower each word present in the paragraph.
        
        // replace all punctuations with the whitespace :-
        paragraph = paragraph.replaceAll("\\p{Punct}", " ");

        HashSet<String> bannedSet = new HashSet<>();

        for(int i = 0; i < n; i++){ // O(n)
            String bannedWord = banned[i].toLowerCase();
            bannedSet.add(bannedWord);
        }

        HashMap<String, Integer> freqMap = new HashMap<>();
        String[] paragraphArr = paragraph.split(" ");
        int m = paragraphArr.length;

        for(int i = 0; i < m; i++){ // O(m)
            String paragraphWord = paragraphArr[i];
            
            if(!bannedSet.contains(paragraphWord) && !paragraphWord.isEmpty()){
                freqMap.put(paragraphWord, freqMap.getOrDefault(paragraphWord, 0) + 1);
            }
        }

        String mostFreqWord = "";
        int maxValue = 0;

        for(Map.Entry<String, Integer> entry : freqMap.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();
            
            if(value > maxValue){
                maxValue = value;
                mostFreqWord = key;
            }
        }

        return mostFreqWord;
    }
}