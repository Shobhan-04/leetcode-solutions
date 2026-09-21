class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(n)
        '''

        n = len(s)
        count_max_vowels, window_vowels = 0, 0
        low, high = 0, (n-1)

        vowels_set = set()

        vowels_set.add('a')
        vowels_set.add('e')
        vowels_set.add('i')
        vowels_set.add('o')
        vowels_set.add('u')

        # Count the number of vowels in the first window :-
        for i in range(k) :
            if s[i] in vowels_set :
                window_vowels += 1
        
        count_max_vowels = window_vowels

        # Slide the window and update the maximum vowels :-
        for i in range(k, n) :
            if s[i-k] in vowels_set :
                window_vowels -= 1
            if s[i] in vowels_set :
                window_vowels += 1
            
            count_max_vowels = max(count_max_vowels, window_vowels)
        
        return count_max_vowels
