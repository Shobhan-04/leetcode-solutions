class Solution:
    def minimizeSum(self, nums: List[int]) -> int:
        '''
            Time complexity = O(n log(n)), 
            Space complexity = O(1)
        '''

        n = len(nums)
        case_1, case_2, case_3 = float('inf'), float('inf'), float('inf')
        minimum_score = float('inf')

        nums.sort() # O(n log(n))

        case_1 = (nums[n-3] - nums[0])
        case_2 = (nums[n-1] - nums[2])
        case_3 = (nums[n-2] - nums[1])

        minimum_score = min(case_1, min(case_2, case_3))

        return minimum_score