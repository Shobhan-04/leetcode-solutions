class Solution {
    public int maximumCount(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */

        int n = nums.length;
        int positive_integer_count = 0, negative_integer_count = 0;
        int max_count = Integer.MIN_VALUE;

        int i = 0;

        while(i < n) { // O(n)
            int num = nums[i];

            if(num < 0) negative_integer_count += 1;
            else if(num > 0) positive_integer_count += 1;

            i++;
        }
        
        max_count = Math.max(positive_integer_count, negative_integer_count);
        
        return(max_count);
    }
}