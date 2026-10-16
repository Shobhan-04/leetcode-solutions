class Solution:
    def numberOfMatches(self, n: int) -> int:
        '''
            Time complexity = O(log(n)), 
            Space complexity = O(1)
        '''

        matches_played_count, advanced_teams_count = 0, 0
        total_matches_count = 0

        while(n > 1) :
            if(n % 2 == 0) :
                matches_played_count = (n // 2)
                advanced_teams_count = (n // 2)
            else :
                matches_played_count = (n - 1) // 2
                advanced_teams_count = ((n - 1) // 2) + 1
            
            total_matches_count += matches_played_count
            n = advanced_teams_count
        
        return total_matches_count