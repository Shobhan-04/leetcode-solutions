class Solution:
    def sumOfUnique(self, nums: list[int]) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(n)
        '''

        n = len(nums)
        unique_set, duplicate_elems_set = set(), set()

        unique_elems_sum = 0

        for i in range(n) : 
            num = nums[i]

            if(num in duplicate_elems_set) :
                continue

            if(num in unique_set) :
                unique_elems_sum -= num
                unique_set.remove(num)
                duplicate_elems_set.add(num) 
            else :
                unique_elems_sum += num
                #  The unique elements of an array are the elements that appear exactly once in the array.
                unique_set.add(num)
        
        return unique_elems_sum # Return the sum of all the unique elements of nums.