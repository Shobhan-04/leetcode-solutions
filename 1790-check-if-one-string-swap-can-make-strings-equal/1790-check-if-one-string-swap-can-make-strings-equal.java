class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int m = s1.length(), n = s2.length();

        if(m != n) return false;
        if(s1.equals(s2)) return true;

        int firstIndex = 0, secondIndex = 0;

        int diffCount = 0;

        for(int i = 0; i < n; i++){ // O(n)
            char s1Ch = s1.charAt(i), s2Ch = s2.charAt(i);

            if(s1Ch != s2Ch){
                diffCount++;

                if(diffCount > 2) return false;
                else if(diffCount == 1) firstIndex = i;
                else secondIndex = i;
            }
        }

        return(diffCount == 2 && (s1.charAt(firstIndex) == s2.charAt(secondIndex)) && (s1.charAt(secondIndex) == s2.charAt(firstIndex)));
    }
}