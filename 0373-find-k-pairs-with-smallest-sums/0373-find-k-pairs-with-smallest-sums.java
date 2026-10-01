class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        /*
            Time complexity = O(min(n1, k)), 
            Space complexity = O(n) -> For minHeap.
        */

        int n1 = nums1.length, n2 = nums2.length;
        List<List<Integer>> kPairsSmallestSums = new ArrayList<>();

        // Custom comparator for comparing the array elements :-
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> (nums1[a[0]] + nums2[a[1]]) - (nums1[b[0]] + nums2[b[1]]));

        int minElem = Math.min(n1, k); // Get the minimum element of n1 and k.

        int i = 0;

        while(i < minElem){ // O(min(n1, k))
            // Pair each nums1 element with the nums2[0]
            minHeap.offer(new int[]{i, 0});
            i++;
        }
        
        while(k > 0 && !minHeap.isEmpty()){
            int[] pair = minHeap.poll();

            i = pair[0];
            int j = pair[1];

            kPairsSmallestSums.add(Arrays.asList(nums1[i], nums2[j]));

            k--;

            // Move to next element in nums2 :-
            if(j + 1 < n2){
                minHeap.offer(new int[]{i, j + 1});
            }
        }

        return kPairsSmallestSums; // Return the k pairs (u1, v1), (u2, v2), ..., (uk, vk) with the smallest sums.
    }
}