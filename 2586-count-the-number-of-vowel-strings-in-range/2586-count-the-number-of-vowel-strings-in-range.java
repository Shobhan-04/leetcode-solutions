class Solution {
    public boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
        {
            return true;
        }

        return false;
    }

    public int vowelStrings(String[] words, int left, int right) {
        /*
            Time complexity = O(right - left + 1) = O(k), 
            Space complexity = O(1)
        */
        
        int n = words.length;
        int countVowelStrings = 0;

        for(int i = left; i <= right; i++){
            String word = words[i];
            int m = word.length();

            char leftCh = word.charAt(0);
            char rightCh = word.charAt(m - 1);

            if(isVowel(leftCh) && isVowel(rightCh)){
                countVowelStrings++;
            }
        }

        return countVowelStrings;
    }
}