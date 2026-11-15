class Solution:
    def areAlmostEqual(self, s1: str, s2: str) -> bool:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''
        
        m, n = len(s1), len(s2)
        diff_count = 0
        first_index, second_index = 0, 0

        if(m != n) :
            return False
        if(s1 == s2) :
            return True

        for i in range(n) :
            s1_ch, s2_ch = s1[i], s2[i]

            if(s1_ch != s2_ch) :
                diff_count += 1
            
                if(diff_count > 2) :
                    return(False)
                elif(diff_count == 1) :
                    first_index = i
                else :
                    second_index = i
        
        comparator = (diff_count == 2 and s1[first_index] == s2[second_index] and s1[second_index] == s2[first_index])

        return comparator