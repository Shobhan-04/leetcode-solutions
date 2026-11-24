class Solution:
    def gcd(self, a: int, b: int) -> int :
        while(b != 0) :
            temp = b
            b = (a % b)
            a = temp
        
        return a

    def lcm(self, a: int, b: int) -> int : 
        if(a == 0 or b == 0) : # Base case
            return a
        
        # Recursive case :
        return((a / (gcd(a, b))) * b)

    def maxLength(self, nums: List[int]) -> int:
        '''
            Time complexity = O(n^2), 
            Space complexity = O(1)
        '''

        n = len(nums)
        max_len = 0

        left = 0

        while(left < n) :
            curr_prod, curr_lcm, curr_gcd = 1, 1, 0
            right = left

            while(right < n) :
                right_num = nums[right]

                curr_gcd = gcd(curr_gcd, right_num)
                curr_lcm = lcm(curr_lcm, right_num)
                curr_prod *= right_num

                if(curr_prod > (curr_lcm * curr_gcd)) :
                    break
                
                if(curr_prod == (curr_lcm * curr_gcd)) :
                    max_len = max(max_len, (right - left + 1))

                right += 1

            left += 1

        return max_len