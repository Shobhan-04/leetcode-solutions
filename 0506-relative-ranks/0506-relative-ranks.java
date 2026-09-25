class Solution {
    public String[] findRelativeRanks(int[] score) {
        /*
            Time complexity = O(n) + O(n) + O(n) + O(n log(n)) = O(n log(n)), 
            Space complexity = O(n) -> Auxilliary space for HashMap.
        */
        
        int n = score.length; // number of elements in score array.
        String[] answer = new String[n]; // stores relative ranks.
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){ // O(n)
            map.put(score[i], i); // Put the elements of score array and its corresponding index i into the map.
        }

        Integer[] sortedArray = new Integer[n];
        for(int i = 0; i < n; i++){ // O(n)
            sortedArray[i] = score[i]; // store the elements from score direcltly into the Integer array.
        }

        // Sort the array in reverse order :-
        Arrays.sort(sortedArray, Collections.reverseOrder()); // O(n log(n))

        for(int i = 0; i < n; i++){ // O(n)
            int originalIndex = map.get(sortedArray[i]); // get the index of a particular element of sortedArray, from the map.

            // The 1st place athlete's rank is "Gold Medal".
            if(i == 0) answer[originalIndex] = "Gold Medal";

            // The 2nd place athlete's rank is "Silver Medal".
            else if(i == 1) answer[originalIndex] = "Silver Medal";

            // The 3rd place athlete's rank is "Bronze Medal".
            else if(i == 2) answer[originalIndex] = "Bronze Medal";

            // For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
            else answer[originalIndex] = String.valueOf(i + 1); // from i = 3 to i = n.
        }

        return answer; // Return an array answer of size n where answer[i] is the rank of the ith athlete.
    }
}