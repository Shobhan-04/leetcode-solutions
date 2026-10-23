class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        /*
            Time complexity = O(n log(n)), 
            Space complexity = O(n)
        */
        
        int m = arr1.length, n = arr2.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the frequency of all elements in arr1 :-
        for(int i = 0; i < m; i++){ // O(m)
            int elem1 = arr1[i];
            map.put(elem1, map.getOrDefault(elem1, 0) + 1);
        }

        // Place elements of arr2 according to the arr1 :-
        int idx = 0;

        for(int i = 0; i < n; i++){ // O(n)
            int elem2 = arr2[i];

            while(map.get(elem2) > 0){
                arr1[idx++] = elem2;
                map.put(elem2, map.get(elem2) - 1);
            }
        }

        List<Integer> remainingElemsArr1 = new ArrayList<>();

        // Add the remaining elements of arr1 from map having value > 0 into the the remainingElemsArr1 :-
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){ // O(n)
            int key = entry.getKey();
            int value = entry.getValue();

            for(int j = 0; j < value; j++){
                remainingElemsArr1.add(key);
            }
        }

        // Sort the list, before adding it into the arr1.
        Collections.sort(remainingElemsArr1); // O(n log(n))

        // Add the remaining elements from remainingElemsArr1 list back into the arr1 :-
        for(int elem : remainingElemsArr1){
            arr1[idx++] = elem;
        }

        return arr1;
    }
}