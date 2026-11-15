class Solution:
    def isPalindrome(self, s: str, left: int, right: int) -> bool :
        while(left < right) :
            left_ch, right_ch = s[left], s[right]

            if(left_ch != right_ch) :
                return False
            
            left += 1
            right -= 1
        
        return True
    
    def backtrack(self, s: str, start: int, current_path: list[str], result: list[list[str]]) -> None: 
        
        n = len(s)
        if(start == n) :
            result.append(current_path.copy()) # Shallow copy
            return
        
        for end in range(start, n) :
            if(self.isPalindrome(s, start, end)) :
                current_path.append(s[start : end + 1])
                self.backtrack(s, end + 1, current_path, result)
                current_path.pop()

    def partition(self, s: str) -> list[list[str]]:
        '''
            Time complexity = O(n * (2 ^ n)), 
            Space complexity = O(n) -> Auxilliary space for the list.
        '''

        result = []
        self.backtrack(s, 0, list(), result)
        return result 