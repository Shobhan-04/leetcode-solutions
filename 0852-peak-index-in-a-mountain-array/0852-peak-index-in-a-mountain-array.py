class Solution:
    def peakIndexInMountainArray(self, arr: list[int]) -> int:
        n = len(arr)
        left, right = 0, (n - 1)

        while(left <= right) :
            mid = right + (left - right) // 2

            if(arr[mid] <= arr[mid + 1]) :
                left = (mid + 1) # Reject the elements from the left.
            else :
                result = mid
                right = (mid - 1) # Reject the elements from the right.
        
        return result