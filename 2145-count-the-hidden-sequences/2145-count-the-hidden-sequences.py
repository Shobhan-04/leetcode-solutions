class Solution:
    def numberOfArrays(self, differences: list[int], lower: int, upper: int) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(differences)

        i = 1
        curr_sum, min_val, max_val = 0, 0, 0
        hidden_sequences_count = 0

        while(i <= n) :
            curr_sum += differences[i-1]
            min_val = min(min_val, curr_sum)
            max_val = max(max_val, curr_sum)

            low = (lower - min_val)
            high = (upper - max_val)

            hidden_sequences_count = (high - low + 1)

            if(hidden_sequences_count <= 0) :
                return 0

            i += 1
        
        return hidden_sequences_count