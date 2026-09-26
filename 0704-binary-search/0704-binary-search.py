class Solution:
    def search(self, nums: list[int], target: int) -> int:
        '''
            Time complexity = O(log(n)), 
            Space complexity = O(1)
        '''

        n = len(nums)
        left, right = 0, (n - 1)

        while(left <= right) : 
            mid = right + (left - right) // 2 

            if(target == nums[mid]) : 
                return mid 
            elif(target > nums[mid]) : 
                left = (mid + 1)
            else : 
                right = (mid - 1) 
        
        return -1