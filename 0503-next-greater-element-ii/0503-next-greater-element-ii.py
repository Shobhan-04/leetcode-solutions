class Solution:
    def nextGreaterElements(self, nums: list[int]) -> list[int]:
        '''
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for the stack, and for doubling the size of nums.
        '''

        nums += nums # Adding the nums with itself to make a double sized array of nums.

        n = len(nums)

        self.stack = []
        ans = [0] * (n)

        i = (n - 1)

        while(i >= 0) :
            num = nums[i] 

            while(len(self.stack) > 0 and self.stack[-1] <= num) :
                self.stack.pop()
            
            if(len(self.stack) == 0) :
                ans[i] = -1
            else :
                ans[i] = self.stack[-1]
            
            self.stack.append(num)

            i -= 1
        
        return ans[0 : len(ans) // 2 : 1]