class Solution {
    public int[] getAverages(int[] nums, int k) {
        /*
            Using sliding window appraoch  :-
                Time complexity = O(n), 
                Space complexity = O(1) -> excluding the resultant array.
        */
        
        int n = nums.length;

        int[] result = new int[n];
        Arrays.fill(result, -1);

        // Base case:
        if(k == 0) return nums;

        // Base case:
        int windowSize = (2 * k + 1);
        if(n < windowSize) return result;

        int left = 0, right = (2 * k);
        long windowSum = 0;
        int i = k;

        for(int idx = left; idx <= right; idx++){
            windowSum += nums[idx];
        }

        result[i] = (int) (windowSum / windowSize);
        i++;
        right++;

        while(right < n){
            int newElem = nums[left], oldElem = nums[right];
            windowSum = (windowSum + oldElem - newElem);

            result[i] = (int) (windowSum / windowSize);
            i++;
            left++;
            right++;
        }

        return result;
    }
}