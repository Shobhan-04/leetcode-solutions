class Solution:
    def numberOfWays(self, s: str) -> int:
        '''
            Intuition :-
                1. If the middle building is '1', the triplet must be "010". That means you need a '0' to its left and a '0' to its right.
                2. If the middle building is '0', the triplet must be "101". That means you need a '1' to its left and a '1' to its right.

            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(s)
        total_zeros, total_ones, left_zeros, left_ones = 0, 0, 0, 0
        number_of_valid_ways = 0

        for i in range(n) :
            s_ch = s[i]

            if(s_ch == '1') :
                total_ones += 1
            elif(s_ch == '0') :
                total_zeros += 1

        for i in range(n) :
            s_ch = s[i]

            if(s_ch == '0') : # 1. 
                right_ones = (total_ones - left_ones)
                number_of_valid_ways += (left_ones * right_ones)
                left_zeros += 1
            elif(s_ch == '1') : # 2.
                right_zeros = (total_zeros - left_zeros)
                number_of_valid_ways += (left_zeros * right_zeros)
                left_ones += 1
        
        return number_of_valid_ways