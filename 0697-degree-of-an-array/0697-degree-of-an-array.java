class Solution {
    public int firstOccurence(int[] nums, int target){
        int n = nums.length;
        int firstIndex = -1;
        
        for(int i = 0; i < n; i++){
            int num = nums[i];

            if(num == target){
                firstIndex = i;
                break;
            }
        }

        return(firstIndex);
    }

    public int lastOccurence(int[] nums, int target){
        int n = nums.length;
        int lastIndex = -1;

        for(int i = (n - 1); i >= 0; i--){
            int num = nums[i];

            if(num == target){
                lastIndex = i;
                break;
            }
        }

        return(lastIndex);
    }

    public int findShortestSubArray(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for HashMap.
        */
        
        int n = nums.length;

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int i = 0; i < n; i++){ // O(n)
            int num = nums[i];
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }  

        int maxValue = -1, maxFreqElem = -1;
        int firstIndex = -1, lastIndex = -1;
        int subArrayLength = -1, minimumSubarrayLength = Integer.MAX_VALUE;

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            int key = entry.getKey(), value = entry.getValue();
            
            if(value > maxValue){
                maxValue = value;
                minimumSubarrayLength = Integer.MAX_VALUE;
            }

            if(value == maxValue){
                maxFreqElem = key;
                firstIndex = firstOccurence(nums, maxFreqElem);
                lastIndex = lastOccurence(nums, maxFreqElem);

                subArrayLength = (lastIndex - firstIndex + 1);

                minimumSubarrayLength = Math.min(minimumSubarrayLength, subArrayLength); 
            }       
        } 

        return minimumSubarrayLength;   
    }
}