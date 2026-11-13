class Solution {
    public boolean areOccurrencesEqual(String s) {
        /* 
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = s.length();
        int[] count = new int[26];

        for(int i = 0; i < n; i++){ // O(n)
            char sCh = s.charAt(i);
            count[sCh - 'a']++;
        }

        int c = 0;

        for(int i = 0; i < 26; i++){ // O(26) = O(1)
            int countElem = count[i];

            if(countElem != 0 && c == 0){
                c = countElem;
            }else if(countElem != 0){
                if(c != countElem) return false;
            }
        }

        return true;
    }
}