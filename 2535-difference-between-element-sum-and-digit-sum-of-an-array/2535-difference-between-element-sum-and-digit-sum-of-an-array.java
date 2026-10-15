class Solution {
    public int differenceOfSum(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = nums.length;

        int i = 0;

        int absoluteDiff = 0;
        int elemSum = 0, digitSum = 0;

        while(i < n){ // O(n)
            int num = nums[i];
            elemSum += num; // The element sum is the sum of all the elements in nums.

            while(num > 0){
                int rem = (num % 10);
                digitSum += rem; // The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
                num /= 10;
            }
            
            i++;
        }

        absoluteDiff = Math.abs(elemSum - digitSum);

        return absoluteDiff; // Return the absolute difference between the element sum and digit sum of nums.
    }
}