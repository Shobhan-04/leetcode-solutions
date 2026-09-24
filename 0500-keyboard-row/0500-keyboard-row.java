class Solution {
    public String[] findWords(String[] words) {
        /*
            Time complexity = O(m * n) 
            Space complexity = O(k * n) = O(n) -> where, k is the size of the ArrayList. 
        */
        
        int n = words.length;

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";   

        List<String> lst = new ArrayList<>();

        for(int i = 0; i < n; i++){
            String word = words[i].toLowerCase(); //  the strings are case-insensitive, both lowercased and uppercased of the same letter are treated as if they are at the same row.
            int m = word.length();

            int[] rows = new int[3]; // Array of rows. rows records which rows actually appeared.

            for(int j = 0; j < m; j++){
                char wordCh = word.charAt(j); // extracting the character from the word.

                if(row1.indexOf(wordCh) != -1) rows[0] = 1;
                else if(row2.indexOf(wordCh) != -1) rows[1] = 1;
                else if(row3.indexOf(wordCh) != -1) rows[2] = 1;
            }

            int sum = (rows[0] + rows[1] + rows[2]);

            // This means only one keyboard row was used, so the entire word can be typed using one row.
            if(sum == 1) lst.add(words[i]);
        }

        int k = lst.size();

        String[] result = new String[k];

        for(int i = 0; i < k; i++){
            result[i] = lst.get(i);
        }

        return result;
    }
}