class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1) -> Considering that, the resultant array doesn't takes any auxilliary space.
        */
        
        int n = nums.length;
        int[] result = new int[n];

        int i = 0;
        int totalSum = 0;

        while(i < n){ // Pre-calculating the prefix sum.
            int num_i = nums[i];
            totalSum += num_i;
            i++;
        }

        int leftSum = 0;
        i = 0;

        while(i < n){
            int num_i = nums[i];

            int leftCount = i;
            int rightCount = (n - i - 1);
            int rightSum = (totalSum - leftSum - num_i);

            int leftDiff = (num_i * leftCount) - leftSum;
            int rightDiff = rightSum - (num_i * rightCount);

            result[i] = (leftDiff + rightDiff);
            leftSum += num_i;

            i++;
        }

        return result;
    }
}