class Solution {
    public int[] frequencySort(int[] nums) {
        /*
            Time complexity = O(n log(n)) for sorting, plus O(n) for frequency counting
            Space complexity = O(n) auxilliary space, for storing the array elements into the freqMap.
        */
        
        int n = nums.length;
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        int i = 0;

        while(i < n){ // O(n)
            int num = nums[i];
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

            i++;
        }

        Integer[] sortedFreqNums = new Integer[n];

        for(int j = 0; j < n; j++){ // O(n)
            sortedFreqNums[j] = nums[j];
        }

        Arrays.sort(sortedFreqNums, (a, b) -> { // O(n log(n))
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);

            // sort the array in increasing order based on the frequency of the values. 
            if(freqA != freqB) return Integer.compare(freqA, freqB);

            // If multiple values have the same frequency, sort them in decreasing order.
            return Integer.compare(b, a);
        });

        int[] resultNums = new int[n];

        for(int j = 0; j < n; j++){ // O(n)
            resultNums[j] = sortedFreqNums[j];
        }
 
        return resultNums; // Return the sorted array.
    }
}