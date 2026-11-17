class Solution:
    def minimumRecolors(self, blocks: str, k: int) -> int:
        ''' 
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(blocks)
        consecutive_white_blocks_count = 0

        i = 0

        # Count the number of white blocks found in a particular window size k :-
        while(i < k) :
            blocks_ch = blocks[i]
            if(blocks_ch == 'W') :
                consecutive_white_blocks_count += 1

            i += 1
        
        i = k
        min_recolors_ops = consecutive_white_blocks_count

        while(i < n) :
            blocks_ch, blocks_k_ch = blocks[i], blocks[i - k]

            if(blocks_ch == 'W') : # Check whether the current character is 'W' then, increment the count.

                consecutive_white_blocks_count += 1
           
            if(blocks_k_ch == 'W') : # Check whether the current's kth character is 'W' then, decrement the count.
                
                consecutive_white_blocks_count -= 1
            
            min_recolors_ops = min(min_recolors_ops, consecutive_white_blocks_count)

            i += 1
        
        return(min_recolors_ops)