class Solution {
    public boolean isMonotonic(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1) 
        */
       
        int n = nums.length;

        boolean isIncreasing = true, isDecreasing = true;
        
        for(int i = 0; i < (n - 1); i++){
            if(nums[i] < nums[i + 1]) isDecreasing = false;
            if(nums[i] > nums[i + 1]) isIncreasing = false;

            if(!isIncreasing && !isDecreasing) return false;
        }

        return(isIncreasing || isDecreasing);
    }
}