class Solution:
    def mySqrt(self, x: int) -> int:
        '''
            Finding square root of a number using Binary Search :-
                Time Complexity = O(n log(n)), 
                Space complexity = O(1)
        '''

        if(x == 0) :
            return 0

        left, right, result = 1, x, 1

        while(left <= right) :
            mid = right + (left - right) // 2

            mid_square = (mid * mid) 

            if(mid_square > x) : 
                right = (mid - 1)
            else :
                result = mid 
                left = (mid + 1)

        return result