class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        /*
            Using minHeap :-
                Time Complexity: O(n * l * log(k)), where n is the number of elements in the array and l is the maximum length of a string.
                
                Space Complexity: O(k * l) to store upto k string elements in the loop.
        */

        int n = nums.length; // no. of elments in nums array.

        Arrays.sort(nums); // Sort the array.

        // Create a Min-Heap of Strings using a custom comparator :-
        PriorityQueue<String> minHeap = new PriorityQueue<>((a, b) -> {
            int aLen = a.length(), bLen = b.length();

            if(aLen != bLen){ // check if the both strings length does'nt match.
                return Integer.compare(aLen, bLen); // Shorter string gets added first in minHeap.
            }

            return a.compareTo(b); // Lexicogrphically compare both the strings if in case the length matches.
        }); 

        String kthLargestInt = ""; // result used to store the kth largest elment in the nums array.

        for(int i = 0; i < n; i++){ // Iterate over the nums length.
            String val = nums[i]; // get each element from the nums array.
            minHeap.offer(val); // Add elements into the minHeap one-by-one.

            int m = minHeap.size(); // get the size of the minHeap.
            if(m > k) minHeap.poll(); // If heap size exceeds k, remove the smallest element from minHeap.
        }

        kthLargestInt = minHeap.peek(); // Display the peek element in the minHeap.
        return kthLargestInt; // Return the string that represents the kth largest integer in nums.
    }
}