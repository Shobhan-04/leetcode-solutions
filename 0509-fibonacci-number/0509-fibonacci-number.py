class Solution:
    def fib(self, n: int) -> int:
        '''
            Iterative approach for finding the fibonacci number :-
                Time complexity = O(n), 
                Space complexity = O(1)
        '''

        if(n == 0) :
            return 0
        
        if(n == 1) :
            return 1
        
        prev2, prev1 = 0, 1
        i = 2
        result = 0

        while(i <= n) :
            result = (prev2 + prev1)
            prev2 = prev1
            prev1 = result

            i += 1
        
        return result