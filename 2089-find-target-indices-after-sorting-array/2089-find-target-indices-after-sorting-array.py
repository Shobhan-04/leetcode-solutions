class Solution:
    def targetIndices(self, nums: list[int], target: int) -> list[int]:
        '''
            Time complexity = O(n log(n)),
            Space complexity = O(log(n))
        '''

        n = len(nums)

        i = 0

        result = []

        nums.sort() # O(n log(n))

        while(i < n) : # O(n)
            num = nums[i]

            if(num == target) :
                result.append(i)
            elif(num > target) :
                return result # Return the empty list as it is.

            i += 1
        
        return result # Return a list of the target indices of nums after sorting nums in non-decreasing order.