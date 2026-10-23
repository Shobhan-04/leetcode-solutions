class Solution {
    int findNumOfDigits(int num){
        /*
           Time complexity = O(digitsCount),
           Space complexity = O(1) 
        */
        
        int digitsCount = 0;

        while(num != 0){
            int lastDigit = (num % 10);
            digitsCount++;
            num /= 10;
        }

        return(digitsCount);
    }

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
            int countDigits = findNumOfDigits(num); // O(digitsCount)

            freqMap.put(countDigits, freqMap.getOrDefault(countDigits, 0) + 1);

            if(countDigits % 2 == 0) evenDigitsCount++;
        }

        return(evenDigitsCount);
    }
}