class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        /*
            Let M, N, and T be the lengths of firstWord, secondWord, and targetWord.
                Time complexity = O(m+n+t), 
                Space complexity = O(m+n+t)
        */
        
        char[] firstWordArr = firstWord.toCharArray();
        char[] secondWordArr = secondWord.toCharArray();
        
        int m = firstWordArr.length, n = secondWordArr.length; 
        
        StringBuilder sbFirst = new StringBuilder();
        StringBuilder sbSecond = new StringBuilder();

        for(int i = 0; i < m; i++){
            char firstCh = firstWordArr[i];
            sbFirst.append(firstCh - 'a');
        }

        for(int i = 0; i < n; i++){
            char secondCh = secondWordArr[i];
            sbSecond.append(secondCh - 'a');
        }

        char[] targetArr = targetWord.toCharArray();
        StringBuilder sbTarget = new StringBuilder();
        int t = targetWord.length();

        for(int i = 0; i < t; i++){
            char targetCh = targetArr[i];
            sbTarget.append(targetCh - 'a');
        }

        int firstInt = Integer.parseInt(sbFirst.toString());
        int secondInt = Integer.parseInt(sbSecond.toString());
        int targetInt = Integer.parseInt(sbTarget.toString());

        return((firstInt + secondInt) == targetInt);
    }
}