class Solution {
    public int findLucky(int[] arr) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for HashMap.
        */
        
        int n = arr.length, largestLuckyNum = Integer.MIN_VALUE;

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int i = 0; i < n; i++){ // Store arr elems into map as <K, V> pairs.
            int elem = arr[i];
            freqMap.put(elem, freqMap.getOrDefault(elem, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            int key = entry.getKey();
            int currLuckyNum = entry.getValue();

            // a lucky integer is an integer that has a frequency in the array equal to its value.
            if(key == currLuckyNum){
                largestLuckyNum = Math.max(largestLuckyNum, currLuckyNum);
            }
        }

        // Return the largest lucky integer in the array. If there is no lucky integer return -1.
        return(largestLuckyNum == Integer.MIN_VALUE ? -1 : largestLuckyNum);
    }
}