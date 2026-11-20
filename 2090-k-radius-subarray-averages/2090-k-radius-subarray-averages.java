class Solution {
    public int[] getAverages(int[] nums, int k) {
        /*
            Using prefix sum array :-
                Time complexity = O(n), 
                Space complexity = O(1) -> excluding the resultant array.
        */
        
        int n = nums.length;
        
        long[] prefixSumArr = new long[n];
        prefixSumArr[0] = nums[0];

        int[] result = new int[n];
        Arrays.fill(result, -1);

        // Base case:
        if(k == 0) return nums;

        int windowSize = (2 * k + 1);
        if(n < windowSize) return result;

        for(int i = 1; i < n; i++){
            prefixSumArr[i] = (nums[i] + prefixSumArr[i - 1]);
        }

        for(int i = k; i <= (n - k - 1); i++){
            int leftIdx = (i - k), rightIdx = (i + k);
            long cumulativeSum = prefixSumArr[rightIdx];

            if(leftIdx > 0){
                cumulativeSum -= prefixSumArr[leftIdx - 1];
            }

            result[i] = (int) (cumulativeSum / windowSize);
        }

        return result;
    }
}