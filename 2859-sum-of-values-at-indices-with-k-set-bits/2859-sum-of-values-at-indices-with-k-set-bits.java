class Solution {
    public int findSumOfDigits(int num){
        int digitSum = 0;

        while(num != 0){
            int rem = (num % 10);
            digitSum += rem;
            num /= 10;
        }

        return digitSum;
    }

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        /*
            Time complexity = O(n + m), 
            Space complexity = O(n) -> Auxilliary space for binaryArr. 
        */
        
        int n = nums.size();
        int indicesWithKSetBitsSum = 0;
        int[] binaryArr = new int[n];

        for(int i = 0; i < n; i++){ // O(n)       
            if(i % 2 == 0) binaryArr[i] = binaryArr[i / 2];
            else binaryArr[i] = binaryArr[i / 2] + 1;
        }

        int m = binaryArr.length;

        for(int i = 0; i < m; i++){ // O(m)
            int binaryElem = binaryArr[i];

            if(findSumOfDigits(binaryElem) == k){
                indicesWithKSetBitsSum += nums.get(i);
            }
        }

        return indicesWithKSetBitsSum;
    }
}