class Solution:
    def duplicateZeros(self, arr: list[int]) -> None:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(arr)
        zeros_count = 0

        for elem in arr :
            if(elem == 0) :
                zeros_count += 1
        
        j = (n - 1) + zeros_count
            
        for i in range(n-1, -1, -1) :
            if(j < n) :
                arr[j] = arr[i]
            
            j -= 1
            
            if(arr[i] == 0) :
                if(j < n) :
                    arr[j] = 0
            
                j -= 1 