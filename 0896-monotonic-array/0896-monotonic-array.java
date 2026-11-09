class Solution {
    public boolean isMonotonic(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1) 
        */
       
        int n = nums.length;

        boolean isIncreasing = true, isDecreasing = true;
        int i = 0, j = 1;

        while(j < n){ // O(n)
            if(nums[i] < nums[j]) isDecreasing = false;
            if(nums[i] > nums[j]) isIncreasing = false;
            if(!isIncreasing && !isDecreasing) return false;

            i++;
            j++;
        }

        return(isIncreasing || isDecreasing);
    }
}