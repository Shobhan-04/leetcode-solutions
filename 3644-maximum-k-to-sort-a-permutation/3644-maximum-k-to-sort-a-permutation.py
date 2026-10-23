class Solution:
    def sortPermutation(self, nums: List[int]) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(nums)

        i, k = 0, -1

        while(i < n) : # O(n)
            num = nums[i]

            if(num != i) :
                k &= nums[i]

            i += 1
        
        return(0 if(k == -1) else k)