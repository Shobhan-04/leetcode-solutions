class Solution {
    public boolean isGoodNumber(int num){
        boolean changePossible = false;

        while(num > 0){
            int digit = (num % 10);

            if(digit == 3 || digit == 4 || digit == 7) return false;
            if(digit == 2 || digit == 5 || digit == 6 || digit == 9) changePossible = true;

            num /= 10;
        }

        return changePossible;
    }

    public int rotatedDigits(int n) {
        /*
            Time complexity = O(nlog_10(n)), 
            Space complexity = O(1)
        */

        int i = 1, countGoodNumber = 0;
        
        while(i <= n){
            if(isGoodNumber(i)) countGoodNumber++;
            i++;
        }

        return countGoodNumber;
    }
}