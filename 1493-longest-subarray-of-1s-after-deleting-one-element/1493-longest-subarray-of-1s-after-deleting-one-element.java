class Solution {
    public int longestSubarray(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = nums.length;
        int sizeOfLongestNonEmptySubarray = 0;
        int zeroCount = 0, left = 0, maxWindowSize = 0, currWindowSize = 0;

        for(int right = 0; right < n; right++){
            int rightNum = nums[right];
            if(rightNum == 0) zeroCount++;

            while(zeroCount > 1){
                int leftNum = nums[left]; 
                if(leftNum == 0) zeroCount--;
                left++;
            }

            sizeOfLongestNonEmptySubarray = Math.max(sizeOfLongestNonEmptySubarray, right - left);   
        }

        if(zeroCount == 0) return(n - 1);

        return sizeOfLongestNonEmptySubarray;
    }
}