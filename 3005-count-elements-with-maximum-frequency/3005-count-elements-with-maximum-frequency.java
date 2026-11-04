class Solution {
    public int maxFrequencyElements(int[] nums) {
        /*
            Optimal :-
                Time complexity = O(n + 101) = O(n), 
                Space complexity = O(101) = O(1)
        */
        
        int n = nums.length;
        int[] freq = new int[101];
        int maxFreq = -1;
        int maxFreqElemsCount = 0;

        for(int i = 0; i < n; i++){ // O(n)
            int num = nums[i];
            freq[num]++; 
            
            int freqCount = freq[num]; 
           
            if(freqCount > maxFreq){ 
                maxFreq = freqCount;
                maxFreqElemsCount =  maxFreq;
            }else if(freqCount == maxFreq){
                maxFreqElemsCount += maxFreq;
            }
        }

        return maxFreqElemsCount;
    }
}