class Solution {
    public boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        return false;
    }

    public int beautifulSubstrings(String s, int k) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = s.length();
        int beautifulSubstringsCount = 0;

        for(int i = 0; i < n; i++){ // O(n)
            int vowelsCount = 0, consonantsCount = 0;

            for(int j = i; j < n; j++){ // O(n)
                char sCh = s.charAt(j);

                if(isVowel(sCh)) vowelsCount++;
                else consonantsCount++;

                if(vowelsCount == consonantsCount && (vowelsCount * consonantsCount) % k == 0) beautifulSubstringsCount++;
            }
        }

        return beautifulSubstringsCount;
    }
}