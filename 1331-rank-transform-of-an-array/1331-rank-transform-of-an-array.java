class Solution {
    public int[] arrayRankTransform(int[] arr) {
        /*
        => Do's :
        -> De-duplication
        -> Sorting
        -> Assign rank to corresponding to the position.
        -> Build the answer list.

        => Dont's :
        -> We must not sort the input array.
        -> Rank for the duplicates are the same.

            Time complexity = O(n) + O(n) + O(n) + O(n log(n)) = O(n log(n)), 
            Space complexity = O(n) -> Auxilliary space for rankSet, map, result, sortedLst.
         */
        
        int n = arr.length;
        HashSet<Integer> rankSet = new HashSet<>();

        // 1. De-duplication is done using the rankSet :-
        for(int i = 0; i < n; i++){ // O(n)
            int num = arr[i];
            
            if(!rankSet.contains(num)){//if rankSet doesn't contains num :-
                rankSet.add(num); // then, add the element into the rankSet.
            }
        }

        // 2. HashSet to List conversion :-
        List<Integer> sortedLst = new ArrayList<>(rankSet);

        Collections.sort(sortedLst); // 3. Sorting the List. TC : O(n log(n))

        // 4. Put all the values stored in the list into the map :-
        HashMap<Integer, Integer> map = new HashMap<>(); // O(n)

        int m = sortedLst.size();

        for(int i = 0; i < m; i++){
            map.put(sortedLst.get(i), i + 1);
        }

        // 5. Build the resultant array :-
        int[] result = new int[n]; // O(n)

        for(int i = 0; i < n; i++){
            result[i] = map.get(arr[i]); // add the stored element in the map into the result.
        }

        return result; // Return the resultant array.
    }
}