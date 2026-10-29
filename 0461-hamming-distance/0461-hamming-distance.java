class Solution {
    public int hammingDistance(int x, int y) {
        /*
            DRY RUN EXPLANATION
            Let's trace this code with an example:
            Input: x = 4 (Binary: 0100), y = 14 (Binary: 1110)
            Expected Output: 2 (Bits differ at positions index 1 and index 3)

            => Loop Tracing (Showing first 4 iterations, 4 to 31 will remain 0):
            
            INITIAL STATE:
            hammingDist = 0

            ITERATION i = 0:
            bitMask       = 1 << 0       => 0001 (Decimal 1)
            x_iThBitSet   = 0100 & 0001  => 0000 (Decimal 0)
            y_iThBitSet   = 1110 & 0001  => 0000 (Decimal 0)
            XOR condition = 0000 ^ 0000  => 0 (Condition 0 != 0 is FALSE)
            hammingDist remains: 0

            ITERATION i = 1:
            bitMask       = 1 << 1       => 0010 (Decimal 2)
            x_iThBitSet   = 0100 & 0010  => 0000 (Decimal 0)
            y_iThBitSet   = 1110 & 0010  => 0010 (Decimal 2)
            XOR condition = 0000 ^ 0010  => 2 (Condition 2 != 0 is TRUE)
            hammingDist increments to: 1

            ITERATION i = 2:
            bitMask       = 1 << 2       => 0100 (Decimal 4)
            x_iThBitSet   = 0100 & 0100  => 0100 (Decimal 4)
            y_iThBitSet   = 1110 & 0100  => 0100 (Decimal 4)
            XOR condition = 0100 ^ 0100  => 0 (Condition 0 != 0 is FALSE)
            hammingDist remains: 1

            ITERATION i = 3:
            bitMask       = 1 << 3       => 1000 (Decimal 8)
            x_iThBitSet   = 0100 & 1000  => 0000 (Decimal 0)
            y_iThBitSet   = 1110 & 1000  => 1000 (Decimal 8)
            XOR condition = 0000 ^ 1000  => 8 (Condition 8 != 0 is TRUE)
            hammingDist increments to: 2

            Iterations 4 to 31 evaluate to 0 since no higher bits are set.
            FINAL RETURN VALUE: 2
        
        Time complexity = O(1), 
        Space complexity = O(1)
        */

        int hammingDist = 0;

        for(int i = 0; i < 32; i++){
            int bitMask = (1 << i); // left shift by ith units. -> bitMask = (1 * (2^i))
            int x_iThBitSet = x & bitMask;
            int y_iThBitSet = y & bitMask;

            if((x_iThBitSet ^ y_iThBitSet) != 0) hammingDist++;
        }

        return hammingDist;
    }
}