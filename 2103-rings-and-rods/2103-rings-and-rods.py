class Solution:
    def countPoints(self, rings: str) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(rings)
        number_of_rods, i = 0, 0  
        color_dict = dict()
        
        while(i < n) : # O(n)
            color, rod_number = rings[i], rings[i + 1]

            if(rod_number not in color_dict) :
                color_dict[rod_number] = set()
            
            color_dict[rod_number].add(color)

            i += 2

        for colors in color_dict.values() :
            if('R' in colors and 'G' in colors and 'B' in colors) :
                number_of_rods += 1

        return number_of_rods