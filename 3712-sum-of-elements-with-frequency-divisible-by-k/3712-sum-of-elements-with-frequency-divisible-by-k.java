class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1) 
        */
        
        int n = nums.length;
        int sumOfElemsDivK = 0;

        int maxValue = Integer.MIN_VALUE;

        // Find the maximum value in the nums array to set the size for the freqArr as (maxValue + 1).
        for(int i = 0; i < n; i++){
            int num = nums[i];
            maxValue = Math.max(maxValue, num);
        }

        int[] freqArr = new int[maxValue + 1];

        for(int i = 0; i < n; i++){ // O(n)
            int num = nums[i];
            freqArr[num]++;
        }

        for(int num = 0; num <= maxValue; num++){
            int freq = freqArr[num];

            if((freq > 0) && (freq % k == 0)){
                sumOfElemsDivK += (num * freq);
            }
        }

        return(sumOfElemsDivK);
    }
}