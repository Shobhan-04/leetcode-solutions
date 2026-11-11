class Solution:
    def checkIfExist(self, arr: list[int]) -> bool:
        '''
            Time complexity = O(n^2), 
            Space complexity = O(1)
        '''

        n = len(arr)

        i = 0

        while(i < n) : # O(n)
            j = 0

            while(j < n) : # O(n)
                if(i != j and (arr[i] == 2 * arr[j])) :
                    return True

                j += 1

            i += 1
        
        return False