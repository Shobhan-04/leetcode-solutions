class Solution:
    def numberGame(self, nums: List[int]) -> List[int]:
        '''
            Time complexity = O(n log(n)) + O(n) = O(n log(n)), 
            Space complexity = O(1) -> Excluding, the auxilliary space consumed for result
        '''

        n = len(nums)

        nums.sort() # O(n log(n))

        result = [0] * n

        i = 0

        while(i < n) : # O(n)
            element_removed_by_alice = nums[i]
            element_removed_by_bob = nums[i+1]

            result[i] = element_removed_by_bob
            result[i+1] = element_removed_by_alice

            i += 2
        
        return result