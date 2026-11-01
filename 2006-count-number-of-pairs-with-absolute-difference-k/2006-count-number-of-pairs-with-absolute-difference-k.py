class Solution:
    def countKDifference(self, nums: list[int], k: int) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(nums)

        i, no_of_pairs_count = 0, 0

        freq = [0] * 101

        while(i < n) : # O(n)
            num = nums[i]
            freq[num] += 1
            i += 1
        
        for j in range(0, (101 - k), 1) : # O(100) = O(1)
            no_of_pairs_count += (freq[j] * freq[j + k])
        
        return no_of_pairs_count