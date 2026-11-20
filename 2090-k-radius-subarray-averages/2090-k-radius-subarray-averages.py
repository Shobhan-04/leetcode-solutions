class Solution:
    def getAverages(self, nums: list[int], k: int) -> list[int]:
        '''
            Time complexity = O(n), 
            Space complexity = O(1) -> Excluding the resultant list.
        '''

        n = len(nums)

        result = [-1] * n

        if(k == 0) : # Base case
            return nums
        
        window_size = (2 * k + 1)
        if(n < window_size) : # Base case
            return result

        i = 1
        
        prefix_sum_arr = [0] * n
        prefix_sum_arr = nums

        while(i < n) :
            num = nums[i]
            prefix_sum_arr[i] = (num + prefix_sum_arr[i - 1])

            i += 1
        
        j = k

        while(j <= (n - k - 1)) :
            left_idx, right_idx = (j - k), (j + k)
            cumulative_sum = prefix_sum_arr[right_idx]

            if(left_idx > 0) :
                cumulative_sum -= prefix_sum_arr[left_idx - 1]

            result[j] = int(cumulative_sum // window_size)

            j += 1

        return result