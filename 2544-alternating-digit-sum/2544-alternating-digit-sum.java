class Solution {
    public int alternateDigitSum(int n) {
        /*
            Time complexity = O(1), 
            Space complexity = O(1)
        */
        
        int alterDigitSum = 0;
        boolean isPositive = true; // Using a boolean flag variable to flip the sign for the adjacent elements.

        int digits = (int) Math.log10(n) + 1;

        if(digits % 2 == 0) isPositive = false; // Base condition

        while(n > 0){
            int rem = (n % 10);

            alterDigitSum += (isPositive ? rem : -rem);
            isPositive = !isPositive; // Flip the sign for the next adjacent element.

            n /= 10;
        }

        return alterDigitSum;
    }
}