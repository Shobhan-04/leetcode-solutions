class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for the set.
        '''

        n = len(nums)
        unique_set = set()

        i = (n - 1)

        while(i >= 0) : # Iterating backwards
            num = nums[i]

            if(num in unique_set) :
                # Remove 3 elements from the beginning of the array. If the array has fewer than 3 elements, remove all remaining elements.
                return(int(ceil((i + 1) / 3.0)))
            else :
                unique_set.add(num) # Add into the set, if the element is not present.

            i -= 1
        
        return 0