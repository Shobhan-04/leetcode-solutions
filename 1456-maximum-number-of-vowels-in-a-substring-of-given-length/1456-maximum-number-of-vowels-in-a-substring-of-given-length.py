class Solution:
    
    # Function for checking the character is vowel or not :-
    def isVowel(self, s_ch: str) -> bool : 
        if(s_ch == 'a' or s_ch == 'e' or s_ch == 'i' or s_ch == 'o' or s_ch == 'u') :
            return True
        
        return False

    def maxVowels(self, s: str, k: int) -> int:
        '''
            Sliding Window Approach :-
                Time complexity = O(n), 
                Space complexity = O(1)
        '''

        n = len(s)
        max_number_of_vowels, curr_window_vowels_count = 0, 0

        for right in range(n) :
            s_ch = s[right]
            if(self.isVowel(s_ch)) : # Check that the current right character is the vowel
                curr_window_vowels_count += 1 # increment the count.

            if(right >= k) :  # Check whether the right index is greater than that of k.
                s_prev_ch = s[right - k] # Calculate the (right - k)th character from the string s and store it in the s_prev_ch named variable.

                if(self.isVowel(s_prev_ch)) : # Check whether (right - k)th character is vowel or not.
                    curr_window_vowels_count -= 1 # decrement the count.

            # Find the maximum of max_number_of_vowels and curr_window_vowels :-
            max_number_of_vowels = max(max_number_of_vowels, curr_window_vowels_count)

        # return the maximum number of vowel letters in any substring of s with length k.
        return max_number_of_vowels