class Solution:
    def twoSum(self, numbers: list[int], target: int) -> list[int]:
        '''
            Time complexity = O(nlog(n))
            Space complexity = O(1)
        '''
        n = len(numbers)
        left, right = 0, (n-1)

        while left < right :
            addRes = numbers[left] + numbers[right]

            if(addRes == target) :
                return [left + 1, right + 1]
            elif(addRes < target) :
                left += 1
            else :
                right -= 1