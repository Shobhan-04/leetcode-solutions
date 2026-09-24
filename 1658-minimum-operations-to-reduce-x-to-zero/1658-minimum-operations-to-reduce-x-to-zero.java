class Solution {
    public int minOperations(int[] nums, int x) {
        /*
            LOGIC :- Instead of removing elements from the left and right whose sum is x, find the longest subarray whose sum is totalSum - x.

            Using Sliding Window Approach :-
                Time complexity = O(n), 
                Space complexity = O(1)
        */
        
        int n = nums.length, totalSumArr = 0;

        for(int i = 0; i < n; i++){
            totalSumArr += nums[i];
        }

        int target = (totalSumArr - x); // target is to reduce the longest subarray whose sum is totalSum - x.

        int minOps = -1;

        if(target == 0) return n;

        int left = 0, right = 0, currSum = 0, maxLength = -1;

        while(right < n){
            currSum += nums[right];

            while(left <= right && currSum > target){
                currSum -= nums[left];
                left++;
            }

            int windowLength = (right - left + 1);

            if(currSum == target){
                maxLength = Math.max(maxLength, windowLength);
            }

            right++;
        }

        minOps = (n - maxLength);

        // Return the minimum number of operations to reduce x to exactly 0 if it is possible, otherwise, return -1.
        return maxLength == -1 ? -1 : minOps;
    }
}