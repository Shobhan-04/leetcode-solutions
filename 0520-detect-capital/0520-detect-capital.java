class Solution {
    public boolean allCapitals(String word){
        int n = word.length();

        for(int i = 0; i < n; i++){ // O(n)
            char wordCh = word.charAt(i);

            if(wordCh < 'A' || wordCh > 'Z') return false;
        }

        return true;
    }

    public boolean allSmall(String word){
        int n = word.length();

        for(int i = 0; i < n; i++){ // O(n)
            char wordCh = word.charAt(i);

            if(wordCh < 'a' || wordCh > 'z') return false;
        }

        return true;
    }

    public boolean detectCapitalUse(String word) {
        int n = word.length();
        if(allCapitals(word) || allSmall(word) || allSmall(word.substring(1))){
            return true;
        }

        return false;
    }
}