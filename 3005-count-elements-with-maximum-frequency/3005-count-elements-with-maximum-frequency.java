class Solution {
    public int maxFrequencyElements(int[] nums) {
        /*
            Time complexity = O(n + 101) = O(n), 
            Space complexity = O(101) = O(1)
        */
        
        int n = nums.length;
        int[] freqCount = new int[101];
        int maxFreq = -1;

        for(int i = 0; i < n; i++){ // O(n)
            int num = nums[i];
            freqCount[num]++;
            maxFreq = Math.max(maxFreq, freqCount[num]);
        }

        int maxFreqElemsCount = 0;

        for(int i = 0; i < 101; i++){ // O(1)
            if(freqCount[i] == maxFreq){
                maxFreqElemsCount += maxFreq;
            }
        }

        return maxFreqElemsCount;
    }
}