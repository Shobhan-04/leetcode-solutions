class Solution:
    def sumDivisibleByK(self, nums: List[int], k: int) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for the freq_dict.
        '''

        n = len(nums)
        max_value = float('-inf')

        # Find the maximum value in the nums array to set the size for the freqArr as (maxValue + 1).
        for i in range(n) : # O(n)
            num = nums[i]
            max_value = max(max_value, num)

        freq_dict = dict()

        for i in range(n) : # O(n)
            num = nums[i]
            freq_dict[num] = freq_dict.get(num, 0) + 1

        sum_of_elems_div_K = 0

        for num, freq in freq_dict.items() :
            if(freq % k == 0) :
                sum_of_elems_div_K += (num * freq)

        return(sum_of_elems_div_K)