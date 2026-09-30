class Solution {
    public boolean isUpper(char ch){
        if(ch >= 'A' && ch <= 'Z') return true;
        return false;
    }

    public boolean detectCapitalUse(String word) {
        /*
            Time complexity = O(n)
            Space complexity = O(1)
        */
        
        int capitalLetterCount = 0;
        int n = word.length();

        for(int i = 0; i < n; i++){ // O(n)
            char wordCh = word.charAt(i);

            if(isUpper(wordCh)) capitalLetterCount++;
        }

        if(capitalLetterCount == 0) return true;
        if(capitalLetterCount == 1 && isUpper(word.charAt(0))) return true;
        if(capitalLetterCount == n) return true;

        return false;
    }
}