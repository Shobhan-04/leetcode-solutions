class Solution {
    public int smallestIndex(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int num = nums[i];
            int sumOfDigits = 0; // sumOfDigits initializes to 0 every iteration.

            while(num > 0){ // calculate the sum of the digits of nums[i].
                int rem = num % 10;
                sumOfDigits += rem;
                num /= 10;
            }

            // Return the smallest index i such that the sum of the digits of nums[i] is equal to i.
            if(sumOfDigits == i) return i; 
        }

        return -1; // If no such index exists, return -1.
    }
}