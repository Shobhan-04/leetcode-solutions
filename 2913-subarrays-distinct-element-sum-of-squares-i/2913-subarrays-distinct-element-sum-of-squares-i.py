class Solution:
    def sumCounts(self, nums: List[int]) -> int:
        '''
            Time complexity = O(n^2)
            Space complexity = O(n) -> Auxilliary space for storing the elements in a set.
        '''

        n = len(nums)
        
        i, distinct_elem_sum = 0, 0

        while(i < n) :
            distinct_set = set()
            j = i

            while(j < n) :
                distinct_set.add(nums[j])
                distinct_elem_sum += pow(len(distinct_set), 2)
                j += 1

            i += 1
        
        return distinct_elem_sum