class Solution:
    def twoOutOfThree(self, nums1: list[int], nums2: list[int], nums3: list[int]) -> list[int]:
        '''
            Time complexity = O(n1 + n2 + n3), 
            Space complexity = O(n1 + n2 + n3)
        '''

        n1, n2, n3 = len(nums1), len(nums2), len(nums3)
        dict1, dict2, dict3 = dict(), dict(), dict()
        
        freq1 = Counter(nums1)
        freq2 = Counter(nums2)
        freq3 = Counter(nums3)

        common_set = set()

        for i in range(n1) :
            num1 = nums1[i]

            if(num1 in freq2 or num1 in freq3) :
                common_set.add(num1)

        for i in range(n2) :
            num2 = nums2[i]

            if(num2 in freq1 or num2 in freq3) :
                common_set.add(num2)
        
        for i in range(n3) :
            num3 = nums3[i]

            if(num3 in freq1 or num3 in freq2) :
                common_set.add(num3)
        
        answer_lst = list()

        for value in common_set :
            answer_lst.append(value)
        
        return(answer_lst)