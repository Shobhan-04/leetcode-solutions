class Solution:
    def destCity(self, paths: list[list[str]]) -> str:
        '''
            Time complexity = O(n), 
            Space complexity = O(n)
        '''

        n = len(paths)

        i = 0

        city_set = set()

        while(i < n) : # O(n)
            city_set.add(paths[i][0])
            i += 1

        destination_city = ""
        
        for city in paths :
            if(not city[1] in city_set) :
                destination_city = city[1]
        
        return(destination_city)