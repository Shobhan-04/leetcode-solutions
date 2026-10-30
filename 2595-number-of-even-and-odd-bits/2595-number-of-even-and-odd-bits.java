class Solution {
    public int[] evenOddBit(int n) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int evenIndexedBitsCount = 0, oddIndexedBitsCount = 0;
        int[] result = new int[2];

        int i = 0;

        while(n != 0){ // O(n)
            if(n % 2 != 0){ // checks whether the current rightmost bit is 1.
                if(i % 2 == 0) evenIndexedBitsCount++;
                else oddIndexedBitsCount++;
            }

            n /= 2;
            i++;
        }

        result[0] = evenIndexedBitsCount;
        result[1] = oddIndexedBitsCount;

        return result;
    }
}