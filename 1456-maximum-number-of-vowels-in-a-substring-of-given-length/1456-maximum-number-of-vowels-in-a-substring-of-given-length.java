class Solution {
    public boolean isVowel(char sCh){
        if(sCh == 'a' || sCh == 'e' || sCh == 'i' || sCh == 'o' || sCh == 'u'){
            return true;
        }

        return false;
    }

    public int maxVowels(String s, int k) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = s.length();
        int maxNumOfVowels = 0, currVowelsCount = 0;

        for(int right = 0; right < n; right++){ // O(n)
            char sCh = s.charAt(right);
            if(isVowel(sCh)) currVowelsCount++;

            if(right >= k){
                char sPrevCh = s.charAt(right - k);
                if(isVowel(sPrevCh)) currVowelsCount--;
            }

            maxNumOfVowels = Math.max(maxNumOfVowels, currVowelsCount);
        }

        return maxNumOfVowels;
    }
}