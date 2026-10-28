class Solution {
    public int findDigitSum(int num){
        int digitSum = 0;

        while(num != 0){
            int rem = (num % 10);
            digitSum += rem;
            num /= 10;
        }

        return digitSum;
    }

    public int maximumSum(int[] nums){
        /*
        Better Approach :-
            Time complexity = O(n.d), where d is the maximum length of pairs,
            Space complexity = O(1) 
        */
        
        int n = nums.length;
        int maxSumOfPair = -1;
        int[] digitSumArr = new int[82];

        for(int i = 0; i < n; i++){ // O(n)
            int num_i = nums[i];
            int sumOfDigits_i = findDigitSum(num_i);

            // If the digit sum already exsists in the map then, update it with the maximum num that results in that sum of digits :-
            if(digitSumArr[sumOfDigits_i] > 0){
                int sumOfPair = num_i + digitSumArr[sumOfDigits_i];
                maxSumOfPair = Math.max(maxSumOfPair, sumOfPair);
            }
            
            // otherwise, element encountered for the first time then, and store the maximum value of sumOfDigits_i and num_i into the map :-
            digitSumArr[sumOfDigits_i] = Math.max(num_i, digitSumArr[sumOfDigits_i]);
        }

        return maxSumOfPair == -1 ? -1 : maxSumOfPair;
    }
}