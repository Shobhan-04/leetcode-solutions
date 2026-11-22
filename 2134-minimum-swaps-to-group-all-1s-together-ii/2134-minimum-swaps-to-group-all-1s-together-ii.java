class Solution {
    public int minSwaps(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for the temp array.
        */
        
        int n = nums.length;
        int minimumNumberOfSwaps = Integer.MAX_VALUE, numberOfSwaps = 0;
        int[] temp = new int[2 * n];
        int totalOnesCount = 0;

        for(int i = 0; i < n; i++){
            temp[i] = nums[i % n]; // Equating it to the twice size for the nums array, as the circular nums array.
        }

        for(int num : nums){
            if(num == 1) totalOnesCount++;
        }

        if(totalOnesCount == 0 || totalOnesCount == n) return 0;

        int currWindowOnesCount = 0, left = 0, right = 0, maxOnesCount = 0;

        while(right < 2 * n){
            int rightTempNum = temp[right % n];
            if(rightTempNum == 1) currWindowOnesCount++;

            if((right - left + 1) > totalOnesCount){
                int leftTempNum = temp[left % n];
                currWindowOnesCount -= leftTempNum;
                left++;
            }

            maxOnesCount = Math.max(maxOnesCount, currWindowOnesCount);
            right++;
        }

        minimumNumberOfSwaps = (totalOnesCount - maxOnesCount);

        return minimumNumberOfSwaps;
    }
}