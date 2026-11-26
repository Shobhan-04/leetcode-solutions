class Solution {
    public int getNumericalValue(String word){
        int n = word.length();
        int num = 0;

        for(int i = 0; i < n; i++){
            char wordCh = word.charAt(i);
            int digit = (wordCh - 'a');
            num = (num * 10) + digit;
        }

        return num;
    }

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
       /*
            Let M, N, and T be the lengths of firstWord, secondWord, and targetWord.
            Time complexity = O(M + N + T)
            Space complexity = O(1)
        */


        int firstInt = getNumericalValue(firstWord);
        int secondInt = getNumericalValue(secondWord);
        int targetInt = getNumericalValue(targetWord);
  
        return((firstInt + secondInt) == targetInt);
    }
}