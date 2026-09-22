class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        /*
            Using minHeap :-
                Time Complexity: O(n * l * log(k)), where n is the number of elements in the array and l is the maximum length of a string.
                Space Complexity: O(k * l) to store upto k string elements in the loop.
        */

        int n = nums.length;

        Arrays.sort(nums); // Sort the array.

        PriorityQueue<String> minHeap = new PriorityQueue<>((a, b) -> {
            int aLen = a.length(), bLen = b.length();

            if(aLen != bLen){
                return Integer.compare(aLen, bLen);
            }

            return a.compareTo(b);
        }); 

        String kthLargestInt = ""; // result used to store the kth largest elment in the nums array.

        for(int i = 0; i < n; i++){ // Iterate over the nums length.
            String val = nums[i]; // get each element from the nums array.
            minHeap.offer(val); // Add elements into the minHeap one-by-one.

            int m = minHeap.size(); // get the size of the minHeap.
            if(m > k) minHeap.poll(); // // 3. If heap size exceeds k, remove the smallest element from minHeap.
        }

        kthLargestInt = minHeap.peek(); // Display the peek element in the minHeap.
        return kthLargestInt; // Return the string that represents the kth largest integer in nums.
    }
}