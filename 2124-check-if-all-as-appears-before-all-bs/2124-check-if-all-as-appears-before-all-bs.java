class Solution {
    public boolean checkString(String s) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */

        int n = s.length();
        
        for(int i = 1; i < n; i++){
            char sCh = s.charAt(i);

            if(sCh == 'a' && s.charAt(i - 1) == 'b') return false;
        }

        return true;
    }
}