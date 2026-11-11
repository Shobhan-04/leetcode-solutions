class Solution:
    def divideArray(self, nums: list[int]) -> bool:
        '''
            Time complexity = O(n), 
            Space complexity = O(501) = O(1)
        '''

        n = len(nums)
        freq = [0] * 501
        i, j = 0, 0

        while(i < n) : # O(n)
            freq[nums[i]] += 1
            i += 1

        m = len(freq)
        
        while(j < m) :
            freqElem = freq[j]
            if(freqElem % 2 != 0) :
                return False

            j += 1
        
        return True