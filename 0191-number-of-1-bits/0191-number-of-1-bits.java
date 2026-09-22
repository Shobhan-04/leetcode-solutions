class Solution {
    public int hammingWeight(int n) {
        int count = 0;

        while(n > 0){
            count += (n % 2); // add 1 if odd and 0 if even.
            n /= 2; // divide by 2.
        }

        return count;
    }
}