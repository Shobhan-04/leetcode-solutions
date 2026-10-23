class Solution {
    public int repeatedNTimes(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n)
        */
        
        int numsLength = nums.length;
        int n = (numsLength / 2);

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int i = 0; i < numsLength; i++){ // O(n)
            int num = nums[i];
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int nTimesRepeatedElem = 0;

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if(value == n) nTimesRepeatedElem = key;
        }

        return nTimesRepeatedElem;
    }
}