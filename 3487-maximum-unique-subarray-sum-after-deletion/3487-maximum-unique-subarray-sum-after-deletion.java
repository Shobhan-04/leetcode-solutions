class Solution {
    public int maxSum(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>(); // Storing the unique subarray elements.

        int i = 0;
        
        int maxSubarraySum = 0;
        int maxNegative = Integer.MIN_VALUE;

        while(i < n){ // O(n)
            int num = nums[i];

            if(num <= 0) maxNegative = Math.max(maxNegative, num);
            else if(!set.contains(num)){ // If element is not present then, add into the subarray.
                maxSubarraySum += num;
                set.add(num);
            }
            
            maxSubarraySum = Math.max(maxSubarraySum, maxNegative);
            i++;
        }

        return maxSubarraySum == 0 ? maxNegative : maxSubarraySum;
    }
}