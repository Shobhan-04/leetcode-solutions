class Solution:
    def triangularSum(self, nums: list[int]) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for newNums.
        '''

        n = len(nums)

        i = 0

        # If n == 1, end the process :-
        if(n == 1) :
            return nums[0]
        
        # Otherwise, create a new 0-indexed integer array newNums of length n - 1 :-
        newNums = [0] * (n - 1)

        # For each index i, where 0 <= i < n - 1 :-
        while(n > 1) :

            # Repeat the entire process starting from step 1.
            for i in range(n-1) :

                # assign the value of newNums[i] as (nums[i] + nums[i+1]) % 10
               newNums[i] = (nums[i] + nums[i+1]) % 10
            
            nums = newNums # Replace the array nums with newNums.

            n -= 1
        
        return nums[0] # Return the triangular sum of nums.