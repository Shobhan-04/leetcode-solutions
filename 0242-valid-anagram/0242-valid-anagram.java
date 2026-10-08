class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length(), n = t.length();
        char[] freqArr = new char[26];
        
        for(int i = 0; i < m; i++){
            char sCh = s.charAt(i);
            freqArr[sCh - 'a']++;
        }

        for(int j = 0; j < n; j++){
            char tCh = t.charAt(j);
            freqArr[tCh - 'a']--;
        }

        for(int i = 0; i < freqArr.length; i++){
            if(freqArr[i] != 0) return false;
        }

        return true;
    }
}