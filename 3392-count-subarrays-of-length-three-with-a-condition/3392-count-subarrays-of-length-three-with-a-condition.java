class Solution {
    public int countSubarrays(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = nums.length;

        int i = 1, subarraysLen3Count = 0;

        while(i < (n-1)){ // O(n)
            int numPrev = nums[i-1];
            int numMid= nums[i];
            int numNext = nums[i+1];

            int sumFirstThird = (numPrev + numNext);

            // Check if the number of subarrays of length 3 such that the sum of the first and third numbers equals exactly half of the second number.
            if((2 * sumFirstThird) == numMid) subarraysLen3Count++; // Increment count.

            i++;
        }

        return(subarraysLen3Count); // Return the subarrays of length 3.
    }
}