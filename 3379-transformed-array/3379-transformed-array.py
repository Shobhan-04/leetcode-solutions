class Solution:
    def constructTransformedArray(self, nums: List[int]) -> List[int]:
        '''
             DRY RUN :-
            E.g. nums = {3, -2, 1, 1}, n = 4
                For (i = 0) :- num = 3, moves = 3 % 4 = 3, newIdx = (1 + 3) % 4 = 3
                    => result[0] = nums[newIdx] = nums[3] => result[0] = 1
                For (i = 1) :- num = -2, moves = (-2) % 4 = 2, 
                    newIdx = (1 + (-2)) % 4 = (-1) % 4 = (4-1) % 4 = (3 % 4) = 3
                    => result[1] = nums[newIdx] = nums[3] => result[1] = 1
                For (i = 2) :- num = 1, moves = 1 % 4 = 1, newIdx = (2 + 1) % 4 = 3
                    => result[2] = nums[newIdx] = nums[3] => result[2] = 1
                For (i = 3) :- num = 1, moves = 1 % 4 = 1, newIdx = (3 + 1) % 4 = 0
                    => result[3] = nums[newIdx] = nums[0] => result[3] = 3
                => result = {1, 1, 1, 3} -> [OUTPUT]
            
            E.g. nums = {-1, 4, -1}, n = 3
                For (i = 0) :- num = -1, moves = (-1) % 3 = 2,
                    newIdx = (0 + (-1)) % 3 = (3-1) % 3 = (2 % 3) = 2
                    => result[0] = nums[newIdx] = nums[2] => result[0] = -1
                For (i = 1) :- num = 4, moves = (4 % 3) = 1, newIdx = (1 + 1) % 4 = 2
                    => result[1] = nums[newIdx] = nums[2] => result[1] = -1
                For (i = 2) :- num = -1, moves = (-1) % 3 = 2, 
                    newIdx = (2 + (-1)) % 3 = (1 % 3) = 1
                    => result[0] = nums[newIdx] = nums[1] => result[2] = 4
                => result = {-1, -1, 4} -> [OUTPUT]
        
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(nums)
        i = 0

        result = [0] * n

        while(i < n) :
            num = nums[i]
            moves = (num % n)
            new_index = (i + moves) % n

            if(new_index < 0) :
                new_index += n
            
            result[i] = nums[new_index]

            i += 1
        
        return result