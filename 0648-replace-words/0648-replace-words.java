class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        /*
            Time complexity = O(n * L), 
            Space complexity = O(D + n)
        */

        int m = dictionary.size();

        HashSet<String> strSet = new HashSet<>();
        
        // Fill strSet with dictionary words.
        for(int i = 0; i < m; i++){
            String dictStr = dictionary.get(i);
            strSet.add(dictStr); 
        }

        String[] words = sentence.split(" "); // Split the sentence into the words string array.
        int n = words.length;

        StringBuilder result = new StringBuilder();

        // Loop through words. 
        for(int i = 0; i < n; i++){
            String word = words[i];
            String root = word;
            int k = word.length();

        // For each word, use an inner loop over prefix lengths from 1 to k.
            for(int j = 1; j <= k; j++){
                String prefix = word.substring(0, j);
                
                // Use strSet.contains(prefix) to find the first matching root. Stop immediately when found, by breaking the loop.
                if(strSet.contains(prefix)){
                    root = prefix;
                    break;
                }
            }

            // Append by adding spaces between words by adding into the result as it is, otherwise append the chosen root or original word to result.
            if(i > 0) result.append(" ");
            result.append(root);
        }

        return result.toString();
    }
}