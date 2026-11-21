class Solution:
    def minimumCost(self, cost1: int, cost2: int, costBoth: int, need1: int, need2: int) -> int:

        '''
            Time complexity = O(1), 
            Space complexity = O(1)
        '''
        
        min_possible_total_cost = 0
        
        needBoth = min(need1, need2)
        min_possible_total_cost = needBoth * min(costBoth, (cost1 + cost2))

        need1 -= needBoth
        need2 -= needBoth

        if(need1 > 0) :
            min_possible_total_cost += need1 * min(costBoth, cost1)
        elif(need2 > 0) :
            min_possible_total_cost += need2 * min(costBoth, cost2)
        
        return min_possible_total_cost