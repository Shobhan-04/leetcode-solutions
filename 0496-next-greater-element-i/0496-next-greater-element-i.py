class Solution:
    def nextGreaterElement(self, nums1: list[int], nums2: list[int]) -> list[int]:
        '''
            Time complexity = O(n + m), 
            Space complexity = O(n) -> Auxilliary space for the stack and the HashMap.
        '''

        m, n = len(nums1), len(nums2)
        self.stack = []

        d = dict()

        for i in range(n-1, -1, -1) : # O(n)
            num2 = nums2[i]

            while(len(self.stack) > 0 and self.stack[-1] <= num2) :
                self.stack.pop()

            if(len(self.stack) == 0) :
                d[num2] = -1
            else :
                d[num2] = self.stack[-1] # adding the top most element of the stack into the ans array.

            self.stack.append(num2)
        
        ans = [0] * m

        for i in range(m) : # O(m)
            num1 = nums1[i]
            ans[i] = d.get(num1)
        
        return ans