class Solution:
    def numberOfBeams(self, bank: list[str]) -> int:
        '''
            Time complexity = O(n * m), 
            Space complexity = O(1)
        '''

        n = len(bank)
        total_laser_beams_count = 0
        prev_object_count = 0

        for i in range(n) :
            curr_object_count = 0
            laser_beam = bank[i]
            m = len(laser_beam)

            for j in range(m) :
                laser_beam_ch = laser_beam[j]
                if(laser_beam_ch == '1') :
                    curr_object_count += 1
                
            total_laser_beams_count += (prev_object_count * curr_object_count)

            if(curr_object_count != 0) :
                prev_object_count = curr_object_count
        
        return total_laser_beams_count