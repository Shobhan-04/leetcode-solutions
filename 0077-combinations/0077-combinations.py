class Solution:
    def solve(self, start: int, n: int, k: int, temp: list[int], result: list[list[int]]) -> None :

        if(k == 0) : 
            result.append(temp.copy()) # Shallow copy.
            return
        
        if(start > n) :
            return 
        
        # Pick the 'start' :-
        temp.append(start) # Add the start
        self.solve(start + 1, n, k - 1, temp, result) # Explore
        temp.pop() # Backtrack

        self.solve(start + 1, n, k, temp, result)

    def combine(self, n: int, k: int) -> list[list[int]]:
        '''
            Time complexity = O(n * (2 ^ n)), 
            Space complexity = O(n) -> For returning the resultant list.
        '''

        answer = []
        self.solve(1, n, k, list(), answer)
        return answer