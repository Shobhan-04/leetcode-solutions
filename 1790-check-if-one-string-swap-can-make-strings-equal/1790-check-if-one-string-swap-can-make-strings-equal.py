class Solution:
    def areAlmostEqual(self, s1: str, s2: str) -> bool:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''
        
        m, n = len(s1), len(s2)
        diff_count = 0
        freq1, freq2 = [0] * 26, [0] * 26

        for i in range(n) :
            s1_ch, s2_ch = s1[i], s2[i]

            if(s1_ch != s2_ch) :
                diff_count += 1
            
            if(diff_count > 2) :
                return(False)
            
            freq1[ord(s1_ch) - ord('a')] += 1
            freq2[ord(s2_ch) - ord('a')] +=1
        
        for i in range(26) :
            if(freq1[i] != freq2[i]) :
                return False
        
        return True