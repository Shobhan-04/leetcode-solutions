class Solution {
    public boolean judgeCircle(String moves) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = moves.length();
        int rightMove = 0, leftMove = 0;
        int upMove = 0, downMove = 0;

        for(int i = 0; i < n; i++){ // O(n)
            char movesCh = moves.charAt(i);

            if(movesCh == 'U') upMove++;
            else if(movesCh == 'D') downMove++;
            else if(movesCh == 'L') leftMove++;
            else if(movesCh == 'R') rightMove++;
        }

        
        if((upMove == downMove) && (leftMove == rightMove)) return true;
        return false;
    }
}