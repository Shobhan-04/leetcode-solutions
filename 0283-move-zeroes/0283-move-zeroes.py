class Solution:
    def swap(self, nums: list[int], i: int, j: int) -> None:
        nums[i], nums[j] = nums[j], nums[i]

    def moveZeroes(self, nums: list[int]) -> None:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(nums)
        left = 0

        for right in range(n) :
            right_num = nums[right]

            if(right_num != 0) :
                self.swap(nums, left, right)
                left += 1