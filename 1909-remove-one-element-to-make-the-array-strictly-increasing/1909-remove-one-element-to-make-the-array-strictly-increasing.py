class Solution:
    def isStrictlyIncreasing(self, nums: list[int], start: int, end: int) -> bool:
        if(start >= end) :
            return True
        
        i = (start + 1)

        while(i <= end) :
            if(nums[i] <= nums[i-1]) :
                return False
            
            i += 1
        
        return True

    def canBeIncreasing(self, nums: list[int]) -> bool:
        '''
            Time complexity = O(n^2), 
            Space complexity = O(n)
        '''

        n = len(nums)

        i = 0

        while(i < n) :
            j, idx = 0, 0
            arr = [0] * (n-1)

            while(j < n) :
                if(i != j) :
                    arr[idx] = nums[j]
                    idx += 1

                j += 1

            m = len(arr)
            if(self.isStrictlyIncreasing(arr, 0, m - 1)) :
                return True

            i += 1
        
        return False