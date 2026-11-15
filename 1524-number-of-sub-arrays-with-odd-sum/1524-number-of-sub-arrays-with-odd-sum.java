class Solution {
    public int numOfSubarrays(int[] arr) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = arr.length;
        int MOD = (int) Math.pow(10, 9) + 7;
        int subarraySum = 0;
        int oddSumSubarrayCount = 0, oddCount = 0, evenCount = 1;

        for(int i = 0; i < n; i++){ // O(n)
            int num = arr[i];
            subarraySum += num;

            if(subarraySum % 2 == 1){
                oddSumSubarrayCount = (oddSumSubarrayCount + evenCount) % MOD;
                oddCount++;
            }else{
                oddSumSubarrayCount = (oddSumSubarrayCount + oddCount) % MOD;
                evenCount++;
            }
        }

        return oddSumSubarrayCount;
    }
}