class Solution {
    public String[] findRelativeRanks(int[] score) {
        /*
            Time complexity = O(n) + O(n log(n)) = O(n log(n)) for sorting the priority queue in descending manner,
            Space complexity = O(n) -> Auxilliary space for PriorityQueue.
        */
        
        int n = score.length; // number of elements in score array.

        // TC : O(n log(n))
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0])); // Sort the priority queue in descending order.

        for(int i = 0; i < n; i++){ // O(n)
            pq.offer(new int[]{score[i], i}); // add each element of the score along with the index i.
        }

        String[] answer = new String[n];

        int i = 0;

        while(!pq.isEmpty()){ // Check if PriorityQueue is not empty.
            int originalIndex = pq.peek()[1]; // add the second most element.
            pq.poll(); // remove each element in the PriorityQueue.

            // The 1st place athlete's rank is "Gold Medal".
            if(i == 0) answer[originalIndex] = "Gold Medal";

            // The 2nd place athlete's rank is "Silver Medal".
            else if(i == 1) answer[originalIndex] = "Silver Medal";

            // The 3rd place athlete's rank is "Bronze Medal".
            else if(i == 2) answer[originalIndex] = "Bronze Medal";

            // For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
            else answer[originalIndex] = String.valueOf(i + 1); // from i = 3 to i = n

            i++; // Increment the ith pointer for every iteration.
        }

        return answer; // Return an array answer of size n where answer[i] is the rank of the ith athlete.
    }
}