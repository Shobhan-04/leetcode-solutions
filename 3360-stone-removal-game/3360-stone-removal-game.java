class Solution {
    public boolean canAliceWin(int n) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int noOfStones = 10; // Alice starts by removing exactly 10 stones on her first turn.
        char turn = 'a';

        while(noOfStones <= n){
            if(turn == 'a') turn = 'b';
            else turn = 'a';

            n = (n - noOfStones); // Finding the available no. of stones.
            noOfStones--; // For each subsequent turn, each player removes exactly 1 fewer stone than the previous opponent.
        }

        return(turn == 'b' ? true : false); // if true then, Alice wins otherwise loose.
    }
}