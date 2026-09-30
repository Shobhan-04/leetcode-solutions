class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        /*
            Time complexity = O(m + n), 
            Sapce complexity = O(1)
        */
        
        int m = word1.length, n = word2.length;
        int i = 0, j = 0;
        int w1_i = 0, w2_i = 0;

        while(w1_i < m && w2_i < n){ // O(m + n)
            if(word1[w1_i].charAt(i) != word2[w2_i].charAt(j)) return false;
            i++;
            j++;

            if(i == word1[w1_i].length()){
                i = 0;
                w1_i++;
            }

            if(j == word2[w2_i].length()){
                j = 0;
                w2_i++;
            }
        }

        return(w1_i == m && w2_i == n) ? true : false;
    }
}