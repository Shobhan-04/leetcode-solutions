class Solution:
    def maxDepthAfterSplit(self, seq: str) -> list[int]:
        '''
            Time complexity = O(n), 
            Space complexity = O(1) -> Assuming, that the output array takes constant space.
        '''

        n = len(seq)
        i, max_nesting_depth = 0, -1
        answer = list()

        while(i < n) : # O(n)
            seq_ch = seq[i]

            if(seq_ch == '(') :
                max_nesting_depth += 1
                
                if(max_nesting_depth % 2 == 0) :
                    answer.append(0)

                else :
                    answer.append(1)
            
            else :

                if(max_nesting_depth % 2 == 0) :
                    answer.append(0)

                else :
                    answer.append(1)
                
                max_nesting_depth -= 1
            
            i += 1
        
        return(answer)