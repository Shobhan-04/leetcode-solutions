class Solution:
    def minCostClimbingStairs(self, cost: list[int]) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(cost)
        climbing_stairs_min_cost = -1
        step_minus_one, step_minus_two = cost[1], cost[0]

        i = 2

        while(i < n) : # O(n)
            step_off_cost_climbing_stairs = min(step_minus_two, step_minus_one)
            current_cost = cost[i] + step_off_cost_climbing_stairs
            step_minus_two = step_minus_one
            step_minus_one = current_cost  

            i += 1
        
        climbing_stairs_min_cost = min(step_minus_two, step_minus_one)
        
        return(climbing_stairs_min_cost)