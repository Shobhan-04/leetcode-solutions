class Solution {
    public int repeatedNTimes(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = nums.length;

        for(int i = 2; i < n; i++){ // O(n)
            int num = nums[i];
            
            if(num == nums[i-1] || num == nums[i-2]) return nums[i];
        }
        
        return nums[0];
    }
}