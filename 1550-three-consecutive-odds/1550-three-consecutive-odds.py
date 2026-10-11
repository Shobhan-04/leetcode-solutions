class Solution:
    def threeConsecutiveOdds(self, arr: list[int]) -> bool:
        
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(arr)
        i = 0

        while(i <= (n - 3)) :
            curr, curr_next1, curr_next2 = arr[i], arr[i+1], arr[i+2]

            if(curr % 2 != 0 and curr_next1 % 2 != 0 and curr_next2 % 2 != 0) :
                return True
            i += 1
        
        return False