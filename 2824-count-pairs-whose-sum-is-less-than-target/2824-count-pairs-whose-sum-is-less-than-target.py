class Solution:
    def countPairs(self, nums: List[int], target: int) -> int:
        '''
            Time complexity = O(n log(n)), 
            Space complexity = O(1)
        '''

        n = len(nums)
        left, right, number_of_pairs = 0, (n - 1), 0

        nums.sort() # O(n log(n))

        while(left <= right) :
            if(nums[left] + nums[right] < target) :
                number_of_pairs += (right - left)
                left += 1
            else :
                right -= 1
        
        return(number_of_pairs)
        