class Solution:
    def fib(self, n: int) -> int:
        '''
            Recursive approach for finding the fibonacci number :-
                Time complexity = O(2^n), 
                Space complexity = O(1)
        '''

        if(n == 0) :
            return 0
        
        if(n == 1) :
            return 1
        
        else :
            return(self.fib(n - 1) + self.fib(n - 2))