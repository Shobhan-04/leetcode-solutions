class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for calculating the storing the nums elements in the prefixSum array.
        */
        
        int n = nums.length;

        int[] result = new int[n];
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];

        for(int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }

        for(int i = 0; i < n; i++){
            int leftSum = prefixSum[i] - nums[i];
            int rightSum = prefixSum[n-1] - prefixSum[i];

            result[i] = (nums[i] * i) - leftSum + rightSum - (nums[i] * (n - i - 1));
        }

        return result;
    }
}