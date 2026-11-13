class Solution {
    public boolean isIncreasingSubarray(int[] nums, int start, int end){
        int n = nums.length;
        int prevNum = 0;

        for(int i = 0; i < n; i++){ // O(n)
            int currNum = nums[i];

            if(i <= end && i >= start) continue;
            if(currNum <= prevNum) return false;
            prevNum = currNum;
        }

        return true;
    }

    public int incremovableSubarrayCount(int[] nums) {
        /*
            Time complexity = O(n^3), 
            Space complexity = O(1)
        */
        
        int n = nums.length;
        int totalNumIncremovableSubarrays = 0;

        for(int i = 0; i < n; i++){ // O(n)
            for(int j = i; j < n; j++){ // O(n)
                if(isIncreasingSubarray(nums, i, j)) totalNumIncremovableSubarrays++;
            }
        }

        return(totalNumIncremovableSubarrays);
    }
}