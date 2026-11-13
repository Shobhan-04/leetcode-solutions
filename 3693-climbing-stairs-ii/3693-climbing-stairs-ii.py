class Solution:
    def climbStairs(self, n: int, costs: List[int]) -> int:
        '''
            Optimized approach using DP (Bottom - Up Approach) :-
                Time complexity = O(n), 
                Space complexity = O(n)
        '''

        n = len(costs)
        dp = [0] * (n + 1)
        cost = 0

        for i in range(n-1, -1, -1) :
            j = (i + 1)
            if(j <= n) :
                cost = (costs[j - 1] + int(pow((j - i),2) + dp[j]))
            
            j = (i + 2)
            if(j <= n) :
                cost = min(cost, (costs[j - 1] + int(pow((j - i), 2) + dp[j])))

            j = (i + 3)
            if(j <= n) :
                cost = min(cost, (costs[j - 1] + int(pow((j - i), 2) + dp[j])))
            
            dp[i] = cost
        
        return(dp[0])
            
