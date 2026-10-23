class Solution {
    public int findNumbers(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for HashMap. 
        */
        
        int n = nums.length;
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        int evenDigitsCount = 0;

        for(int i = 0; i < n; i++){ // O(n)
            int num = nums[i];
            String numStr = Integer.toString(num);
            int m = numStr.length();

            freqMap.put(m, freqMap.getOrDefault(m, 0) + 1);

            if(m % 2 == 0) evenDigitsCount++;
        }

        return(evenDigitsCount);
    }
}