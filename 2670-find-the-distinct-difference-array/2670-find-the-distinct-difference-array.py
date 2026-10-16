class Solution:
    def countDistinctElements(self, nums: List[int], low: int, high: int) -> int :
        count = 0
        visited = [False] * 100

        i = low
        while(i <= high) :
            num = nums[i]
            if(not visited[num]) :
                visited[num] = True
                count += 1

            i += 1

        return count

    def distinctDifferenceArray(self, nums: List[int]) -> List[int]:
        '''
            Eg. 1 :-
            nums = {1,2,3,4,5}
            distinct difference = (countPrefix - countSuffix)
                => For (i = 0) -> (0, 0), (1, 4) => (1 - 4) = -3
                => For (i = 1) -> (0, 1), (2, 4) => (2 - 3) = -1
                => For (i = 2) -> (0, 2), (3, 4) => (3 - 2) = 1
                => For (i = 3) -> (0, 3), (4, 4) => (4 - 1) = 3
                => For (i = 4) -> (0, 4), (1, 4) => (5 - 0) = 5
            
            Eg. 2 :-
            nums = {1,2,2}
            distinct difference = (countPrefix - countSuffix) = (0, i) - (i+1, n-1)
                => For (i = 0) -> (0, 0), (1, 2) => (1 - 1) = 2
                => For (i = 1) -> (0, 1), (2, 2) => (2 - 1) = 1
                => For (i = 2) -> (0, 2), (3, 2) => (2 - 0) = 2
            
            Time complexity = O(n), 
            Space complexity = O(1) -> Considering that the resultant array doesn't takes any auxilliary space.
        '''

        n = len(nums)

        distinctDiff = [0] * n

        i = 0

        while(i < n) :
            count_prefix = self.countDistinctElements(nums, 0, i)
            count_suffix = self.countDistinctElements(nums, i+1, n-1)
            distinctDiff[i] = (count_prefix - count_suffix)
            
            i += 1
        
        return distinctDiff