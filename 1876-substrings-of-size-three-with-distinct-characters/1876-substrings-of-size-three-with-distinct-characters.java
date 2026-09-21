class Solution {
    public int countGoodSubstrings(String s) {
        /*
            Two pointer approach :-
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = s.length();
        int left = 0, right = 2;
        int countGoodSubStr = 0;

        while(right < n){
            char sCh = s.charAt(left);
            char sChNext = s.charAt(left + 1);
            char sChNextNext = s.charAt(left + 2);

            if(sCh != sChNext && sChNext != sChNextNext && sChNextNext != sCh)
            {
                countGoodSubStr++;
            }

            left++;
            right++;
        }

        return countGoodSubStr;
    }
}