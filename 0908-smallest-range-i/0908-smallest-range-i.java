class Solution {
    public int smallestRangeI(int[] nums, int k) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = nums.length;

        int i = 0;
        int minScore = Integer.MAX_VALUE, score = 0;
        int minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;

        while(i < n){ // O(n)
            int num = nums[i];
            minVal = Math.min(minVal, num);
            maxVal = Math.max(maxVal, num);

            i++;
        }

        minScore = (maxVal - minVal - (2 * k));
        minScore = Math.max(minScore, score);

        return(minScore);
    }
}