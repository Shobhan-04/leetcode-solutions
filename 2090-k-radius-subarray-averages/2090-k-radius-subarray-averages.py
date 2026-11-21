class Solution:
    def getAverages(self, nums: list[int], k: int) -> list[int]:
        '''
            Time complexity = O(n), 
            Space complexity = O(1) -> Excluding the resultant list.
        '''

        n = len(nums)

        result = [-1] * n

        # Base case: 
        if(k == 0) :
            return nums

        # Base case: 
        window_size = (2 * k + 1)
        if(n < window_size) :
            return result
        
        left, right, window_sum, i = 0, (2 * k), 0, k
        idx = left

        # Find the sum of the current window :-
        while(idx <= right) :
            window_sum += nums[idx] 
            idx += 1
        
        result[i] = (window_sum // window_size)
        i += 1
        right += 1

        while(right < n) :
            new_elem, old_elem = nums[left], nums[right]
            window_sum = (window_sum + old_elem - new_elem)

            result[i] = (window_sum // window_size)
            i += 1
            right += 1
            left += 1
    
        return result
