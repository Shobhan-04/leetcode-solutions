class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = nums.length;
        int i = 1;

        int longestSubarrayLen = 1;
        int increasingCount = 1, decreasingCount = 1;

        while(i < n){
            int currElem = nums[i], prevElem = nums[i-1];

            if(currElem < prevElem){
                decreasingCount++;
                increasingCount = 1; // reset
            }else if(currElem > prevElem){
                increasingCount++;
                decreasingCount = 1; // reset
            }else{
                increasingCount = 1; // reset
                decreasingCount = 1; // reset
            }

            longestSubarrayLen = Math.max(longestSubarrayLen, Math.max(increasingCount, decreasingCount));

            i++;
        }

        return longestSubarrayLen;
    }
}