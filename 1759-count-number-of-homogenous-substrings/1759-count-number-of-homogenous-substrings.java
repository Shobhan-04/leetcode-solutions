class Solution {
    public int countHomogenous(String s) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = s.length(), MOD = 1_000_000_000 + 7;

        int i = 0, homogeneousCount = 0, subStringLength = 0;

        while(i < n){ // O(n)
            char sCh = s.charAt(i);

            if(i > 0 && sCh == s.charAt(i-1)) subStringLength++;
            else subStringLength = 1;

            i++;
            homogeneousCount = (homogeneousCount + subStringLength) % MOD;
        }

        return homogeneousCount;
    }
}