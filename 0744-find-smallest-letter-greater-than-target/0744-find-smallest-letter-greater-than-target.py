class Solution:
    def binarySearch(self, letters: list[str], target: str) -> str:
        n = len(letters)
        left, right = 0, (n - 1)
        smallest_char = letters[0]

        while(left <= right) :
            mid = left + (right - left) // 2

            if(letters[mid] <= target) :
                left = (mid + 1) # Search in the right part of teh letters array.
            else :
                smallest_char = letters[mid]
                right = (mid - 1)
        
        return(smallest_char)

    def nextGreatestLetter(self, letters: list[str], target: str) -> str:
        '''
            Time complexity = O(log(n)), 
            Space complexity = O(1)
        '''

        return(self.binarySearch(letters, target))