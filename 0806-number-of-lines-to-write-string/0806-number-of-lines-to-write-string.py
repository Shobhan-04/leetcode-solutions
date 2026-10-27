class Solution:
    def numberOfLines(self, widths: List[int], s: str) -> List[int]:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        m, n = len(widths), len(s)
        total_num_of_lines, last_line_width = 1, 0

        i = 0

        result = [0] * 2

        while(i < n) : # O(n)
            s_ch = s[i]
            curr_width = widths[ord(s_ch) - ord('a')]

            if((curr_width + last_line_width) > 100) :
                total_num_of_lines += 1
                last_line_width = 0 # Reset in every iteration when moving to the next line.

            last_line_width += curr_width
            
            i += 1 
        
        result[0], result[1] = total_num_of_lines, last_line_width

        return result
