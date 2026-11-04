class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(nums)

        max_freq, max_freq_elems_count = -1, 0
        freq = [0] * 101
        freq_count = 0

        for i in range(n) :
            num = nums[i]
            freq[num] += 1

            freq_count = freq[num]

            if(freq_count > max_freq) :
                max_freq = freq_count
                max_freq_elems_count = max_freq
            elif(freq_count == max_freq) :
                max_freq_elems_count += max_freq
            
        return max_freq_elems_count