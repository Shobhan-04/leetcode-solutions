class Solution:
    def minimumSwaps(self, nums: list[int]) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(nums)
        left, right = 0, (n - 1)
        minimum_swaps = 0

        while(left < right) :
            left_num, right_num = nums[left], nums[right]

            if(left_num != 0) :
                left += 1 # Move towards to the right.
            
            elif(right_num == 0) : # No swap needed, keep that zero right there.
                right -= 1 # Move towards the left.
            
            elif(left_num == 0 and right_num != 0) :
                minimum_swaps += 1
                left += 1 # Move towards the right.
                right -= 1 # Move towards the left.
        
        return minimum_swaps # Return an integer denoting the minimum number of operations required to move all 0s to the end of the array.