class Solution:
    def numOfSubarrays(self, arr: list[int], k: int, threshold: int) -> int:
        '''
            Performing a fixed sized sliding window of size = k :-
                Time complexity = O(n), 
                Space complexity = O(1)
        '''

        n = len(arr)
        i, num_of_subarrays, left, current_window_sum = 0, 0, 0, 0

        for right in range(n) :
            right_num = arr[right]

            current_window_sum += right_num

            if((right - left + 1) == k) :
                # The number of sub-arrays of size k and average greater than or equal to threshold :-
                
                if(current_window_sum >= threshold * k) :
                    num_of_subarrays += 1
                
                left_num = arr[left]
                current_window_sum -= left_num
                left += 1
        
        return num_of_subarrays