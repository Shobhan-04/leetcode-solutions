class Solution {
    public int hammingDistance(int x, int y) {
        /*
            Time complexity = O(1), 
            Space complexity = O(1)
        */

        // x ^ y gives a number where the corresponding bits are different, so by counting them we get, the required hamming distance.

        return(Integer.bitCount(x ^ y));
    }
}