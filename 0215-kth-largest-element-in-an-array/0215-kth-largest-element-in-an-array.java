class Solution {
    public int findKthLargest(int[] nums, int k) {
        /*
            Using minHeap :-
                Time complexity = O(m*log(n)), 
                Space complexity = O(1)
        */

        int n = nums.length;
        Arrays.sort(nums); // Sort the array.

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Maintain a minHeap.
        int result = 0;

        for(int i = 0; i < n; i++){
            int val = nums[i];
            minHeap.offer(val); // Add elements into the minHeap one-by-one.

            int m = minHeap.size();
            if(m > k) minHeap.poll(); // Remove the top most element from the minHeap.
        }

        result = minHeap.peek(); // Display the peek element in the minHeap,
        return result;
    }
}