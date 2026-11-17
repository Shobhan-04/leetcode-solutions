class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        /*
            Time complexity = O(n),
            Space complexity = O(k) -> Auxilliary space for the HashSet, for holding atmost k integers.
        */
        
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        long maximumSubarraySum = 0, currentWindowSum = 0;
        int left = 0;

        for(int right = 0; right < n; right++){
            int rightNum = nums[right];

            while(set.contains(rightNum) || (right - left + 1) > k){
                int leftNum = nums[left];
                set.remove(leftNum);
                currentWindowSum -= leftNum;
                left++;
            }

            set.add(rightNum);
            currentWindowSum += rightNum;

            int currentWindowLength = (right - left + 1);
            if(currentWindowLength == k){
                maximumSubarraySum = Math.max(maximumSubarraySum, currentWindowSum);
            }
        }

        return maximumSubarraySum == 0 ? 0 : maximumSubarraySum;
    }
}