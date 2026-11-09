class Solution:
    def minOperations(self, nums: List[int]) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for the stack.
        '''

        n = len(nums)
        stack = [0]
        operations_count = 0

        for i in range(n) : # O(n)
            num = nums[i]

            while(stack and stack[-1] > num) :
                stack.pop()
            
            if(not stack or stack[-1] < num) :
                operations_count += 1
                stack.append(num)

        return(operations_count)