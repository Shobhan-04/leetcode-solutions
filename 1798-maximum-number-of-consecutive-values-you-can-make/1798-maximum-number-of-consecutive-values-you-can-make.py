class Solution:
    def getMaximumConsecutive(self, coins: list[int]) -> int:
        '''
            Time complexity = O(n log(n)) + O(n) = O(n log(n)), 
            Space comlexity = O(1)
        '''

        n = len(coins)

        i, result = 0, 1

        coins.sort() # O(n log(n))

        while(i < n) : # O(n)
            coin = coins[i]

            if(coin > result) :
                break
            result += coin

            i += 1
        
        return result