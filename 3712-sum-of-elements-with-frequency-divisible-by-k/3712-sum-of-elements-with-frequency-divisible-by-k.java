class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for HashMap.
        */
        
        int n = nums.length;
        int sumOfElemsDivK = 0;
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int i = 0; i < n; i++){ // O(n)
            int num = nums[i];
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            int num = entry.getKey(), freq = entry.getValue();

            if(freq % k == 0){
                sumOfElemsDivK += (num * freq);
            }
        }

        return(sumOfElemsDivK);
    }
}