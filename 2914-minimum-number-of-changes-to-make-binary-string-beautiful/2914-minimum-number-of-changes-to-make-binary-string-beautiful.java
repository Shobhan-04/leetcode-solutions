class Solution {
    public int minChanges(String s) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = s.length();
        char currCh = s.charAt(0);
        int count = 0, minimumNumOfChanges = 0;

        for(int i = 0; i < n; i++){
            char sCh = s.charAt(i);

            if(sCh == currCh){
                count++;
                continue;
            }

            // if s.charAt(i) != currCh then, 
            if(count % 2 == 0){
                count = 1; // start with new substring.
            }else{
                minimumNumOfChanges++;
                count = 0;
            }

            currCh = s.charAt(i); // update to new character.
        }      

        return minimumNumOfChanges;  
    }
}