class Solution:
    def kthDistinct(self, arr: list[str], k: int) -> str:
        '''
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for the count_dict.
        '''

        n = len(arr)

        # Count the frequency of the array elements :-
        count_dict = Counter(arr)

        i, distinct_count = 0, 0
        kTh_distinct_str = ""

        while(i < n) : # O(n)
            arr_elem = arr[i]
            if(count_dict.get(arr_elem) == 1) :
                distinct_count += 1

                if(distinct_count == k) :
                    kTh_distinct_str = arr_elem

            i += 1
        
        return "" if(kTh_distinct_str == "") else kTh_distinct_str 