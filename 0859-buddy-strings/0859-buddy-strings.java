class Solution {
    public boolean checkFrequency(String s){
        int n = s.length();
        int[] freqArr = new int[26]; // O(26) = O(1)
        int i = 0;

        while(i < n){ // O(n)
            char sCh = s.charAt(i);
            freqArr[sCh - 'a']++;

            if(freqArr[sCh - 'a'] > 1) return true;
            i++;
        }

        return false;
    }

    public boolean buddyStrings(String s, String goal) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int m = s.length(), n = goal.length();
        int first = -1, second = -1, mismatchCount = 0;

        if(m != n) return false;

        if(s.equals(goal)) return(checkFrequency(s));

        int i = 0;

        while(i < n){ // O(n)
            char sCh = s.charAt(i),  goalCh = goal.charAt(i);
            
            if(sCh != goalCh) {
                mismatchCount++;

                if(mismatchCount == 1) first = i;
                else if(mismatchCount == 2) second = i;
                else return false;
            }

            i++;
        }

        
        if(mismatchCount != 2) return false;

        char first_sCh = s.charAt(first);
        char second_sCh = s.charAt(second);
        char first_goalCh = goal.charAt(first);
        char second_goalCh = goal.charAt(second);

        return(first_sCh == second_goalCh && second_sCh == first_goalCh);
    }
}