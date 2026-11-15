class Solution:
    def solve(self, start: int, target: int, k: int, temp: list[int], result: list[list[int]]) :

        # Valid combination found :-
        if(k == 0 and target == 0) : # Base case
            result.append(temp.copy()) # Shallow copy
            return
        
        # Skip if start exceeds from (0-9), picked too many numbers, or sum exceeds the target :-
        if(start > 9 or target < 0 or k < 0) : # Base case
            return 
        
        temp.append(start) # Add the 'start'
        self.solve(start + 1, target - start, k - 1, temp, result) # Explore, by subtracting the 'start' from the 'target'.
        temp.pop() # Backtrack

        self.solve(start + 1, target, k, temp, result) # Skip the 'start'

    def combinationSum3(self, k: int, n: int) -> list[list[int]]:
        '''
            Time complexity = O(n * (2 ^ n)), 
            Space complexity = O(n) -> For returning the list.
        '''

        result, temp = list(), list()
        self.solve(1, n, k, temp, result)
        return result