class Solution:
    def binarySearch(self, nums : list[int], target : int) -> int :
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(nums)
        left, right = 0, (n - 1)

        while(left <= right) :
            mid = left + (right - left) // 2

            if(nums[mid] == target) :
                return(mid + 1)
            elif(nums[mid] < target) :
                left = (mid + 1)
            else :
                right = (mid - 1)
            
        return(left)

    def answerQueries(self, nums: list[int], queries: list[int]) -> list[int]:
        '''
            Time complexity = O(m log(n)) + O(n log(n)) + O(n) = O((n + m) log(n)), 
            Space complexity = O(n + m) -> Auxilliary space for the prefixSumArr and the answer array.
        '''

        n, m = len(nums), len(queries)

        nums.sort() # O(n log(n))
        answer = [0] * m
        
        prefix_sum_lst = [0] * n
        prefix_sum_lst[0] = nums[0]

        for i in range(1, n) : # O(n)
            prefix_sum_lst[i] = (nums[i] + prefix_sum_lst[i - 1])
        
        for i in range(m) : # O(m log(m))
            query = queries[i]
            subsequence_index = self.binarySearch(prefix_sum_lst, query)
            answer[i] = subsequence_index
        
        return(answer)