class Solution {
    public int gcd(int a, int b){ // calculate GCD of two nos. iteratively.
        while(b != 0){
            int temp = b;
            b = (a % b);
            a = temp;
        }

        return a;
    }

    public int minOperations(int[] nums) {
        /*
            Steps :-
            1. Count n. of ones. = countOnes
            2. if(countOnes > 0) return(n - countOnes)
            3. Find the best index to start the conversion.

            Time complexity = O(n^2),
            Space complexity = O(1)
        */
        
        int n = nums.length, result = 0, gcdTwoInts = 0, minOps = Integer.MAX_VALUE;
        int left = 0, right = 0, countOnes = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] == 1) countOnes++;
        }

        // Base condition :-
        if(countOnes > 0) return(n - countOnes);

        for(left = 0; left < n-1; left++){ // 0 <= i < n - 1
            int num = nums[left];
            
            for(right = left+1; right < n; right++){ // i+1 <= j < n
                int currNum = nums[right]; // nums[j] = nums[i+1]

                gcdTwoInts = gcd(num, currNum); // nums[i] or nums[i+1] with their gcd value.

                num = gcdTwoInts;

                if(gcdTwoInts == 1){
                    minOps = Math.min(minOps, (right - left + 1));
                    break;
                }
            }
        }

        // Return the minimum number of operations to make all elements of nums equal to 1. If it is impossible, return -1.

        if(minOps == Integer.MAX_VALUE) return -1;

        return((minOps - 1) + (n - 1));
    }
}