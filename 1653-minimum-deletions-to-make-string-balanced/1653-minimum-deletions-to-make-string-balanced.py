class Solution:
    def minimumDeletions(self, s: str) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(n)
        '''

        n = len(s)
        stack = [] 
        min_deletions_count = 0

        for i in range(n) :
            s_ch = s[i]

            if(not(len(stack) == 0) and s_ch == 'a' and stack[-1] == 'b') :
                stack.pop()
                min_deletions_count += 1
            else :
                stack.append(s_ch)
        
        return min_deletions_count