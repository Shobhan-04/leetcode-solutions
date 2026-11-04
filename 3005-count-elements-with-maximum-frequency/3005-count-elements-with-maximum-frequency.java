class Solution {
    public int maxFrequencyElements(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for the HashMap.
        */
        
        int n = nums.length;
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int maxFreq = -1;

        for(int i = 0; i < n; i++){ // O(n)
            int num = nums[i];
            freqMap.put(num, freqMap.getOrDefault(num,0) + 1);
            maxFreq = Math.max(maxFreq, freqMap.get(num));
        }

        int maxFreqElemsCount = 0;

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            int key = entry.getKey(), value = entry.getValue();
            if(value == maxFreq){
                maxFreqElemsCount += maxFreq;
            }
        }

        return maxFreqElemsCount;
    }
}