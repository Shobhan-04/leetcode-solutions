class Solution:
    def findTheDistanceValue(self, arr1: list[int], arr2: list[int], d: int) -> int:
        '''
            Time complexity = O(m * n), 
            Space complexity = O(1)
        '''

        m, n = len(arr1), len(arr2)

        i, distance_count = 0, 0

        while(i < m) : # O(m)
            curr_1 = arr1[i]
            j = 0
            valid = True

            while(j < n) : # O(n)
                curr_2 = arr2[j]
                curr_D = abs(curr_1 - curr_2)

                if(curr_D <= d) :
                    valid = False
                    break

                j += 1

            if(valid == True) :
                distance_count += 1

            i += 1
        
        return distance_count