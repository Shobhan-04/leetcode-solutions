class Solution:
    def sortArrayByParity(self, nums: list[int]) -> list[int]:
        '''
            Time complexity = O(n) 
            Space complexity = O(1)
        '''

        n, left, right = len(nums), 0, 0

        while(right < n) :
            if(nums[right] % 2 == 0) : 
                temp = nums[right] 
                nums[right] = nums[left]
                nums[left] = temp
            
                left += 1

            right += 1
        
        return nums
