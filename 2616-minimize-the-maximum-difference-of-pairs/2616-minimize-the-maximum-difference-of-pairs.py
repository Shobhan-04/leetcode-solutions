class Solution:
    def isValid(self, nums: List[int], mid: int, p: int) :
        n = len(nums)

        i, pairs_count, min_diff = 0, 0, float('inf')

        while(i < n - 1) :
            min_diff = (nums[i + 1] - nums[i])

            if(min_diff <= mid) :
                pairs_count += 1
                i += 2
            else :
                i += 1
            
        return(True if(pairs_count >= p) else False)

    def minimizeMax(self, nums: List[int], p: int) -> int:
        '''
            Time complexity = O(n * log(m)), 
            Space complexity = O(1)
        '''

        n = len(nums)
        nums.sort()

        left, right = 0, (nums[n-1] - nums[0])

        min_max_diff = float('inf')

        while(left <= right) : # O(log(m))
            mid = left + (right - left) // 2

            if(self.isValid(nums, mid, p)) : # O(n)
                min_max_diff = mid
                right = (mid - 1)
            else :
                left = (mid + 1)
            
        return min_max_diff