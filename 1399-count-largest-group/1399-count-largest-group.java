class Solution {
    public int findDigitSum(int num){
        /*
            Time complexity = O(digits), 
            Space complexity = O(1)
        */
        
        int digitSum = 0;
        
        while(num != 0){
            int rem = (num % 10);
            digitSum += rem;
            num /= 10;
        }

        return digitSum;
    }

    public int countLargestGroup(int n) {
        /*
            Time complexity = O(n * digits), 
            Space complexity = O(n) -> Auxilliary space for the HashMap.
        */
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int largestGrpCount = 0, maxSize = 0;

        for(int i = 1; i <= n; i++){ // O(n)
            int sumOfDigits = findDigitSum(i); // O(digits)
            // Add the <K, V> pair into the map where key is from 1-13 and value is its corresponding sumOfDigits :-
            map.put(sumOfDigits, map.getOrDefault(sumOfDigits, 0) + 1);
            
            int currSize = map.get(sumOfDigits); // Get the current size of the map.
            if(currSize == maxSize){ // if currSize equals to maxSize
                largestGrpCount++; // then, increment the count.
            }else if(currSize > maxSize){ // if currSize greater than maxSize
                maxSize = currSize; // then, set the maxSize as the currSize.
                largestGrpCount = 1; // Re-initiliaze the count to 1, if element is encountered for the very first time.
            }
        }

        return(largestGrpCount); // Return the number of groups that have the largest size, i.e. the maximum number of elements.
    }
}