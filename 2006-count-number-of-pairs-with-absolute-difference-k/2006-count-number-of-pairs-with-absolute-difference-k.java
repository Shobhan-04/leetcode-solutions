class Solution {
    public int countKDifference(int[] nums, int k) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for the HashMap. 
        */
        
        HashMap<Integer, Integer> absoluteMap = new HashMap<>();
        int i = 0, n = nums.length;
        int noOfPairsCount = 0;

        while(i < n){ // O(n)
            int num = nums[i];
            // Storing the absolute difference k as :- num + |k| = (num (+/-) k)
            noOfPairsCount += absoluteMap.getOrDefault(num - k, 0);
            noOfPairsCount += absoluteMap.getOrDefault(num + k, 0);
            
            // Store the final num with the frequency count into the map :-
            absoluteMap.put(num, absoluteMap.getOrDefault(num , 0) + 1);
            i++;
        }

        return(noOfPairsCount);
    }
}