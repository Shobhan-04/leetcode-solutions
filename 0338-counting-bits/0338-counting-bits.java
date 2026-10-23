class Solution {
    public int[] countBits(int n) {
        int[] binaryArr = new int[n + 1];

        for(int i = 0; i < (n + 1); i++){
            if(i % 2 == 0){ // For even indices
                binaryArr[i] = binaryArr[i / 2];
            }else{ // For odd indices
                binaryArr[i] = binaryArr[i / 2] + 1;
            }
        }

        return binaryArr;
    }
}