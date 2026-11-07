class Solution:
    def sumDivisibleByK(self, nums: List[int], k: int) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(nums)
        max_value = float('-inf')

        # Find the maximum value in the nums array to set the size for the freqArr as (maxValue + 1).
        for i in range(n) : # O(n)
            num = nums[i]
            max_value = max(max_value, num)

        freq_lst = [0] * (max_value + 1)

        for i in range(n) : # O(n)
            num = nums[i]
            freq_lst[num] += 1

        sum_of_elems_div_K = 0

        for num in range(max_value + 1) :
            freq = freq_lst[num]

            if((freq > 0) and (freq % k == 0)) :
                sum_of_elems_div_K += (num * freq)

        return(sum_of_elems_div_K)