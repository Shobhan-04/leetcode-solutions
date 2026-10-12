class Solution {
    public int minimumSum(int num) {
        /*
            Time complexity = O(1), 
            Space complexity = O(1)
        */
        
        int[] digits = new int[4];
        int i = 0;

        while(num != 0){
            digits[i] = (num % 10); // get the last digit.
            num /= 10; 
            i++;
        }

        Arrays.sort(digits); 

        int d0 = digits[0], d1 = digits[1], d2 = digits[2], d3 = digits[3];

        int num1 = (d0 * 10) + d2;
        int num2 = (d1 * 10) + d3;

        int minimumSum = (num1 + num2);

        return minimumSum;
    }
}