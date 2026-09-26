class Solution:
    def merge(self, nums1: list[int], m: int, nums2: list[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """

        '''
            Time complexity = O(n log(n)), 
            Space cmplexity = O(1)
        '''

        i, j, k = (m - 1), (n - 1), (m + n - 1)

        while(j >= 0) :
            if(i < 0 or nums2[j] >= nums1[i]) : 
                nums1[k] = nums2[j]
                k -= 1
                j -= 1
            else :
                nums1[k] = nums1[i]
                k -= 1
                i -= 1
        