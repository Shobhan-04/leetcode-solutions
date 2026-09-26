class Solution:
    def lowerBound(self, nums, target) : 
        n = len(nums)
        left, right, result = 0, (n - 1), n

        while(left <= right) :
            mid = right + (left - right) // 2

            if(nums[mid] >= target) :
                result = mid 
                right = (mid - 1)
            else : 
                left = (mid + 1)

        return result 

    def searchInsert(self, nums: list[int], target: int) -> int:
        '''
            Time complexity = O(log(n)), 
            Space complexity = O(1)
        '''

        return self.lowerBound(nums, target)
