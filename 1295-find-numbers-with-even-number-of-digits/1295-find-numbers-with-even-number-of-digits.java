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
            int numOfDigits = (int) Math.ceil(Math.log10(num + 1));

            freqMap.put(numOfDigits, freqMap.getOrDefault(numOfDigits, 0) + 1);

            if(numOfDigits % 2 == 0) evenDigitsCount++;
        }

        return(evenDigitsCount);
    }
}