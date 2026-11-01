class Solution:
    def findSecondLargestElement(self, nums : list[int]) -> int :
        n = len(nums)
        largest, second_largest = -1, -1

        for i in range(n) :
            num = nums[i]

            if(num > largest) :
                second_largest = largest
                largest = num
            
            elif(num > second_largest and num < largest) :
                second_largest = num
        
        return second_largest

    def secondHighest(self, s: str) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(10) = O(1)
        '''

        n = len(s)

        i = 0

        digits_lst, seen_lst = [] * 10, [False] * 10
        index = 0

        while(i < n) :
            s_ch = s[i]

            if(s_ch.isdigit()) :
                digit = int(s_ch)

                if(not seen_lst[digit]) :
                    digits_lst.append(digit)
                    seen_lst[digit] = True 

            i += 1
        
        second_largest_digit = self.findSecondLargestElement(digits_lst)

        return second_largest_digit