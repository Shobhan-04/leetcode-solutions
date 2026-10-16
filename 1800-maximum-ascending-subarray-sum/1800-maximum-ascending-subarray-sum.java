class Solution {
    public int maxAscendingSum(int[] nums) {
        /*
            Time complexity = O(n), 
            Sapce complexity = O(1)
        */
        
        int n = nums.length;

        int i = 1;

        int sum = nums[0], maxAscSubArrSum = sum;

        while(i < n){
            int num = nums[i];
            
            if(num > nums[i-1]) sum += num;
            else sum = num;

            maxAscSubArrSum = Math.max(maxAscSubArrSum, sum);
            
            i++;
        }

        return maxAscSubArrSum;
    }
}