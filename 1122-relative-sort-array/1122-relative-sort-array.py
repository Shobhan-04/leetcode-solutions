class Solution:
    def relativeSortArray(self, arr1: list[int], arr2: list[int]) -> list[int]:
        '''
            In-place counting sort approach :-
                Time complexity = O(n log(n)), 
                Space complexity = O(n)
        '''

        m, n = len(arr1), len(arr2)

        # freq_dict stores the frequency of all elements stored in arr1 :-
        freq_dict = Counter(arr1)

        i, idx = 0, 0

        #  Place elements of arr2 according to the arr1 :-
        while(i < n) :
            elem2 = arr2[i]

            while(freq_dict.get(elem2) > 0) :
                arr1[idx] = elem2
                idx += 1
                freq_dict[elem2] -= 1

            i += 1
        
        remaining_elems_arr1 = []

        # Add the remaining elements of arr1 in ascending order from freq_dict having value > 0 into the the remaining_elems_arr1 :-
        for key, value in freq_dict.items() :
            remaining_elems_arr1.extend([key] * value)

        # Sort the list, before adding it into the arr1.
        remaining_elems_arr1.sort() # O(n log(n))

        # Add the remaining elements from remaining_elems_arr1 list back into the arr1 :-
        for elem in remaining_elems_arr1 :
            arr1[idx] = elem
            idx += 1
        
        return arr1 # 