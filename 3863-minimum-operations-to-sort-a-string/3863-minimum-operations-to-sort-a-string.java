class Solution {
    public int minOperations(String s) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = s.length();
        boolean isSorted = true;

        int i = 0;

        char minCh = 'z', maxCh = 'a';

        while(i < n){
            char sCh = s.charAt(i);
            minCh = (char) Math.min(minCh, sCh);
            maxCh = (char) Math.max(maxCh, sCh);

            if(i > 0 && sCh < s.charAt(i-1)) isSorted = false;
            i++;
        }

        if(isSorted == true) return 0;
        if(n == 2) return -1;
        if(s.charAt(0) == minCh || s.charAt(n-1) == maxCh) return 1;

        i = 1;
        while(i < n-1){
            if(s.charAt(i) == minCh || s.charAt(i) == maxCh) return 2;
            i++;
        }

        return 3;
    }
}