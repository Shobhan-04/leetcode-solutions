class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int lenLongestFiboSubarray = Integer.MIN_VALUE;
        int length = 2; // Minimum length of subarray length is 2.

        int i = 2;

        while(i < n){
            // A Fibonacci array is a contiguous sequence whose third and subsequent terms each equal the sum of the two preceding terms.
            if(nums[i] == nums[i-1] + nums[i-2]){ 
                length++; // Increment the window length based on the fibonacci sequence, as the subarray length.
            }else{
                lenLongestFiboSubarray = Math.max(lenLongestFiboSubarray, length);
                length = 2; // skip to the 2nd index, based on the fibonacci sequence if breaking within the middle. 
            }

            lenLongestFiboSubarray = Math.max(lenLongestFiboSubarray, length);
            i++;
        }

        return(lenLongestFiboSubarray);
    }
}