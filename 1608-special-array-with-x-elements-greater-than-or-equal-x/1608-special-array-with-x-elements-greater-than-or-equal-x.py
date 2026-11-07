class Solution:
    def binarySearch(self, nums: list[int], target: int) -> int :
        n = len(nums)
        left, right, first_idx = 0, (n - 1), -1

        while(left <= right) :
            mid = left + (right - left) // 2

            if(nums[mid] >= target) :
                first_idx = mid
                right = (mid - 1)
            else :
                left = (mid + 1)
        
        return(first_idx)


    def specialArray(self, nums: list[int]) -> int:
        '''
            Time complexity = O(n log(n)), 
            Space complexity = O(1)
        '''

        n = len(nums)
        x = 1

        nums.sort() # O(n log(n))

        while(x <= n) : # O(n)
            first_index = self.binarySearch(nums, x) # O(log(n))
            count = (n - first_index)

            if(count == x) :
                return(x)

            x += 1
        
        return(-1)