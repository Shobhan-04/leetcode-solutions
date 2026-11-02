class Solution:
    def isPrime(self, num : int) -> int : 
        if(num <= 1) :
            return False

        i = 2

        while(i * i <= num) :
            if(num % i == 0) :
                return False

            i += 1
        
        return True

    def diagonalPrime(self, nums: List[List[int]]) -> int:
        m, n = len(nums), len(nums[0])

        i = 0
        largest_prime_number = 0

        while(i < m) : # O(m)
            j = 0

            while(j < n) : # O(n)
                is_prime_diagonal = (i == j)
                is_secondary_diagonal = (j == (n - i - 1))

                if(is_prime_diagonal or is_secondary_diagonal) :
                    val = nums[i][j]

                    if(val > largest_prime_number and (self.isPrime(val) == True)) :
                        largest_prime_number = val
            
                j += 1

            i += 1
        
        return largest_prime_number