class Solution:
    def minimumDeletions(self, s: str) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for the left_a and right_b lists  respectively.
        '''

        n = len(s)
        left_b, right_a, count_a, count_b = [0] * n, [0] * n, 0, 0
        min_deletions_count = float('inf')

        for i in range(n) :
            left_b[i] = count_b

            s_ch = s[i]
            if(s_ch == 'b') :
                count_b += 1
        
        for i in range(n-1, -1, -1) :
            right_a[i] = count_a

            s_ch = s[i]
            if(s_ch == 'a') :
                count_a += 1

        for i in range(n) :
            min_deletions_count = min(min_deletions_count, (left_b[i] + right_a[i]))
        
        return min_deletions_count