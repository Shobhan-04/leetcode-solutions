class Solution {
    public int numberOfMatches(int n) {
        /*
            Time complexity = O(log(n)), 
            Space complexity = O(1)
        */
        
        int matchesPlayedCount = 0, advancedTeamsCount = 0, totalMatchesCount = 0;

        while(n > 1){
            if(n % 2 == 0){ // If the current number of teams is even, each team gets paired with another team. 
                matchesPlayedCount = (n / 2); //  A total of n / 2 matches are played,
                advancedTeamsCount = (n / 2); // and n / 2 teams advance to the next round.
            }else{ // If the current number of teams is odd, one team randomly advances in the tournament, and the rest gets paired. 
                matchesPlayedCount = (n - 1) / 2; // A total of (n - 1) / 2 matches are played,
                advancedTeamsCount = ((n - 1) / 2) + 1; // and (n - 1) / 2 + 1 teams advance to the next round.
            }

            totalMatchesCount += (matchesPlayedCount);
            n = advancedTeamsCount; // re-initialize the value of n in every iteration.
        }
        
        return(totalMatchesCount); // Return the number of matches played in the tournament until a winner is decided.
    }
}