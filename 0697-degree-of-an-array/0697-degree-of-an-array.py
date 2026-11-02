class Solution:
    def firstOccurence(self, nums : list[int], target : int) -> int :
        n = len(nums)
        first_index = -1

        for i in range(0, n, 1) :
            if(nums[i] == target) :
                first_index = i
                break
        
        return first_index
    
    def lastOccurence(self, nums : list[int], target : int) -> int :
        n = len(nums)
        last_index = -1

        for i in range(n-1, -1, -1) :
            if(nums[i] == target) :
                last_index = i
                break
        
        return last_index

    def findShortestSubArray(self, nums: list[int]) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(n) -> for the frequency dictionary.
        '''

        n = len(nums)

        freq_dict = dict()

        for i in range(n) :
            num = nums[i]
            freq_dict[num] = freq_dict.get(num, 0) + 1
        
        max_value, max_freq_elem = -1, -1
        first_index, last_index = -1, -1
        subarray_length, min_subarray_length = -1, float('inf')

        for key, value in freq_dict.items() :
            if(value > max_value) :
                max_value = value
                min_subarray_length = float('inf')
            
            if(value == max_value) :
                max_freq_elem = key
                
                first_index = self.firstOccurence(nums, max_freq_elem)
                last_index = self.lastOccurence(nums, max_freq_elem)
                
                subarray_length = (last_index - first_index + 1)
                min_subarray_length = min(min_subarray_length, subarray_length)
            
        return min_subarray_length