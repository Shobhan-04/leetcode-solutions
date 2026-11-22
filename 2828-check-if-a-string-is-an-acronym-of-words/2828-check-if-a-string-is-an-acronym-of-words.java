class Solution {
    public boolean isAcronym(List<String> words, String s) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int m = words.size(), n = s.length();

        // Base case:
        if(m != n) return false;

        for(int i = 0; i < n; i++){
           String word = words.get(i); // Extract the particular word from the list of words. 

           // Check whether every i-th character of the word matches with the i-th character of the string s :-
           if(!(word.charAt(0) == s.charAt(i))) return false;
        }

        return true;
    }
}