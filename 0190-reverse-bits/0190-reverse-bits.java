class Solution {
    public int reverseBits(int n) {
        /*
            Time complxity = O(1),
            Space complexity = O(1) 
        */

        int reversedBits = 0;

        for(int i = 1; i <= 32; i++){ // O(32) = O(1)
            int rightMostBit = (n & 1); // get the right most bit.

            reversedBits <<= 1; // Create the space for storing the bits by doing left shift by 1. -> n = (n * (2^1))
            
            reversedBits |= rightMostBit; // changing the right most bit every time.
            
            n >>= 1; // right shift by 1. -> n = (n / (2^1))
        }

        return reversedBits;
    }
}