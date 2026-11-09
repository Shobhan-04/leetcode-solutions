class Solution:
    def readBinaryWatch(self, turnedOn: int) -> list[str]:
        '''
            Time complexity = O(12 * 60) = O(720) = O(1), 
            Space complexity = O(n) -> Auxilliary space for the resultant list.
        '''

        result = [] 

        for hh in range(12) :
            for mm in range(60) :
                if((hh.bit_count() + mm.bit_count()) == turnedOn) :
                    result.append(f"{hh}:{mm:02d}")
        
        return result