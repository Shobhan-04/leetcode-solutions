class Solution {
    public int minSwaps(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1) 
        */
        
        int n = nums.length;
        int totalOnesCount = 0;
        int left = 0;
        int minimumNumberOfSwaps = Integer.MAX_VALUE, numberOfSwaps = 0;

        for(int num : nums){
            if(num == 1) totalOnesCount++;
        }

        if(totalOnesCount == 0 || totalOnesCount == n) return 0;

        int currWindowOnesCount = 0;

        for(int right = 0; right < n + totalOnesCount - 1; right++){
            int rightNum = nums[right % n];

            if(rightNum == 1){
                currWindowOnesCount++;
            }

            while((right - left + 1) > totalOnesCount){
                int leftNum = nums[left % n];
                if(leftNum == 1) currWindowOnesCount--;
                left++;
            }

            if((right - left + 1) == totalOnesCount){
                numberOfSwaps = (totalOnesCount - currWindowOnesCount);
                minimumNumberOfSwaps = Math.min(minimumNumberOfSwaps, numberOfSwaps);
            }
        }

        return minimumNumberOfSwaps;
    }
}