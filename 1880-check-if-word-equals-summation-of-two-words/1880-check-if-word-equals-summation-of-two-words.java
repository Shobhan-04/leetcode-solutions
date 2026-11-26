class Solution {
    public int convertToInt(String word){
        char[] wordArr = word.toCharArray();
        int n = wordArr.length;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++){
            char wordCh = wordArr[i];
            sb.append(wordCh - 'a');
        }

        return(Integer.parseInt(sb.toString()));
    }

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        /*
            Let M, N, and T be the lengths of firstWord, secondWord, and targetWord.
                Time complexity = O(m+n+t), 
                Space complexity = O(m+n+t)
        */

        int firstInt = convertToInt(firstWord);
        int secondInt = convertToInt(secondWord);
        int targetInt = convertToInt(targetWord);

        return((firstInt + secondInt) == targetInt);
    }
}