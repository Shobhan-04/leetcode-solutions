class Solution {
    public int concatenatedBinary(int n) {
        /*
            Time complexity = O(log(n)), 
            Space complexity = O(1)
        */
        
        int i = 1; // Initial value and goes upto n.
        int MOD = 1_000_000_007;
        long currentDecimalValue = 0;
        int decimalValue = 0;

        while(i <= n){ // Repeat until we've processed n. 
            int currentInteger = i;
            
            // Binary string representation :-
            String binaryString = Integer.toBinaryString(i); // decimal -> binary

            // Determine the number of bits in its binary representation.
            int noOfBits = binaryString.length();
            
            // Shift the current result left by that number of bits.
            currentDecimalValue = (currentDecimalValue << noOfBits); // binary -> decimal

            // Add the current integer to the shifted result.
            currentDecimalValue += currentInteger;
            currentDecimalValue %= MOD; // apply modulo and update the running result.

            i++;
        }

        return (int) currentDecimalValue; // return the decimal value of the binary string formed by concatenating the binary representations of 1 to n in order, modulo 109 + 7.
    }
}