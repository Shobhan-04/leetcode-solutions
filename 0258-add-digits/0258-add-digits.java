class Solution {
    public int addDigits(int num) {
        /*
            Time complexity = O(log(n)), 
            Space complexity = O(1)
        */
        
        int remainder = 0;

        while(num >= 10){ // Checking until num >= 10 (two digits)
            int digitsSum = 0;

            while(num != 0){
                remainder = (num % 10);
                digitsSum += remainder;
                num /= 10;
            }

            num = digitsSum;
        }

        return num;
    }
}