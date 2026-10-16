class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = differences.length;
        int hiddenSequencesCount = 0;

        int i = 1;

        int currSum = 0;
        int minVal = 0, maxVal = 0;

        while(i <= n){ // O(n)
            currSum += differences[i-1];
            minVal = Math.min(minVal, currSum);
            maxVal = Math.max(maxVal, currSum);

            // alpha -> [lower - arr[i], upper - arr[i]]
            int low = (lower - minVal);
            int high = (upper - maxVal);
            
            hiddenSequencesCount = (high - low + 1);

            if(hiddenSequencesCount <= 0) return 0;
            i++;
        }

        return hiddenSequencesCount;
    }
}