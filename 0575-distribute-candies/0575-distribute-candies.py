class Solution:
    def distributeCandies(self, candyType: list[int]) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for set.
        '''

        n = len(candyType)

        i, candies_count = 0, 0
        unique_candies_set = set()

        # Storing unique candyType into the set :-
        while(i < n) :
            unique_candies_set.add(candyType[i])
            i += 1
        
        m = len(unique_candies_set)

        # return the maximum number of different types of candies she can eat if she only eats n / 2 of them.
        candies_count = int(min(m, (n / 2)))
        
        return candies_count