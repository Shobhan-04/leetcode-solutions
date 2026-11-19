class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1) 
        */
        
        int n = arr.length;
        int left = 0, numOfSubarrays = 0;
        int currentWindowSum = 0;

        for(int right = 0; right < n; right++){
            int rightNum = arr[right];
            currentWindowSum += rightNum;

            if((right - left + 1) == k){
                if(currentWindowSum >= threshold * k){
                    numOfSubarrays++;
                }

                int leftNum = arr[left];
                currentWindowSum -= leftNum;

                left++;
            }
        }

        return numOfSubarrays;
    }
}