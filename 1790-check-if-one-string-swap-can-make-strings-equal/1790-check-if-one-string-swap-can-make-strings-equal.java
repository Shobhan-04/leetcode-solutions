class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = s1.length();
        n = s2.length();

        if(s1 == s2) return true;

        int[] freq1 = new int[26];
        Arrays.fill(freq1, 0);
        int[] freq2 = new int[26];
        Arrays.fill(freq2, 0);

        int diffCount = 0;

        for(int i = 0; i < n; i++){ // O(n)
            char s1Ch = s1.charAt(i), s2Ch = s2.charAt(i);

            if(s1Ch != s2Ch) diffCount++;

            if(diffCount > 2) return false;

            freq1[s1Ch - 'a']++;
            freq2[s2Ch - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }

        return true;
    }
}