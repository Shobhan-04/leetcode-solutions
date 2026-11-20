class Solution {
    public int minChanges(String s) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = s.length();
        int minimumNumOfChanges = 0;

        for(int i = 0; i < n; i += 2){
            char sCh = s.charAt(i);
            char sNextCh = s.charAt(i + 1);

            if(sCh != sNextCh) minimumNumOfChanges++;
        }      

        return minimumNumOfChanges;  
    }
}