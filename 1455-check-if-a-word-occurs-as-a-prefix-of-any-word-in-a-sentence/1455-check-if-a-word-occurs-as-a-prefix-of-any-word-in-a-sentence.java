class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */

        // Base condition :-
        if(sentence == null || searchWord == null || searchWord.isEmpty()){
            return -1;
        }
        
        String[] sentenceArr = sentence.split(" ");
        int n = sentenceArr.length;

        int i = 0;

        while(i < n){ // O(n)
            String word = sentenceArr[i]; 

            if(word.startsWith(searchWord)){
                return(i + 1);
            }

            i++;
        }  

        return -1;      
    }
}