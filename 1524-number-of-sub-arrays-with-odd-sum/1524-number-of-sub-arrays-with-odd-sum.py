class Solution:
    def numOfSubarrays(self, arr: list[int]) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(arr)
        MOD = 10 ** 9 + 7

        i, odd_sum_subarray_count = 0, 0
        even_count, odd_count =  1, 0 # even_count has 0 as the prefix sum.
        subarray_sum = 0

        while(i < n) : # o(n)
            num = arr[i]
            subarray_sum += num

            if(subarray_sum % 2 == 1) :
                odd_sum_subarray_count = (odd_sum_subarray_count + even_count) % MOD
                odd_count += 1
            else :
                odd_sum_subarray_count = (odd_sum_subarray_count + odd_count) % MOD
                even_count += 1

            i += 1
        
        return odd_sum_subarray_count