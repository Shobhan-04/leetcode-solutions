class Solution {
    public long maxAlternatingSum(int[] nums) {
        /*
            Time complexity = O(n log(n)) + O(n) = O(n log(n)), 
            Space complexity = O(1)
        */
        
        int n = nums.length;
        long maxPossibleAlternatingScore = 0;

        int i = 0;

        // Find the square of each element and store it back in the nums array :-
        while(i < n){ // O(n)
            int num = nums[i];
            int power = (int) Math.pow(num, 2);
            nums[i] = power;

            i++;
        }

        Arrays.sort(nums); // O(n log(n))

        int mid = (n / 2);

        for(int j = 0; j < mid; j++){ // Subtract the first half of the array.
            maxPossibleAlternatingScore -= nums[j];
        }

        for(int j = mid; j < n; j++){ // Add the second half of the array.
            maxPossibleAlternatingScore += nums[j];
        }

        return maxPossibleAlternatingScore; // Return an integer denoting the maximum possible alternating score of nums after rearranging its elements.
    }
}