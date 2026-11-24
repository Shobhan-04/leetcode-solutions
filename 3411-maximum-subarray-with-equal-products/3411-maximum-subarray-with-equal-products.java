class Solution {
    public long gcd(long a, long b){
        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public long lcm(long a, long b){
        // Base case :
        if(a == 0 || b == 0) return 0;

        // Recursive case :
        return((a / (gcd(a, b)) * b));
    }

    public int maxLength(int[] nums) {
        /*
            Time complexity = O(n^2), 
            Space complexity = O(1)
        */
        
        int n = nums.length;
        int maxLen = 1;
        
        for(int i = 0; i < n; i++){ // O(n)
            long currProd = 1, currGcd = 0, currLcm = 1;

            for(int j = i; j < n; j++){ // O(n)
                currGcd = gcd(currGcd, (long) nums[j]);
                currLcm = lcm(currLcm, (long) nums[j]);
                currProd *= (long) nums[j];

                if(currProd > (currGcd * currLcm)){
                    break;
                }

                if(currProd == (currGcd * currLcm)){
                    maxLen = Math.max(maxLen, (j - i + 1));
                }
            }
        }

        return maxLen;
    }
}