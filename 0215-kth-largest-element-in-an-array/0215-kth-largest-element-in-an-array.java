class Solution {
    public int findKthLargest(int[] nums, int k) {
        /*
            Using minHeap :-
                Time complexity = O(m*log(n)), 
                Space complexity = O(1)
            where m is the size of minHeap.
        */

        int n = nums.length; // no. of elements in nums array.
        Arrays.sort(nums); // Sort the array.

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Maintain a minHeap.
        int result = 0; // result used to store the kth largest elment in the nums array.

        for(int i = 0; i < n; i++){ // Iterate over the nums length.
            int val = nums[i]; // get each element from the nums array.
            minHeap.offer(val); // Add elements into the minHeap one-by-one.

            int m = minHeap.size(); // get the size of the minHeap.
            if(m > k) minHeap.poll(); // Remove the top most element from the minHeap.
        }

        result = minHeap.peek(); // Display the peek element in the minHeap,
        return result; // Return the kth largest element in the array.
    }
}