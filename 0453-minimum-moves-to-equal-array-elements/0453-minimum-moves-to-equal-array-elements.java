class Solution {
    public int minMoves(int[] nums) {
        /*
            [1, 2, 3] -> [1, 2, 2] -> [1, 2, 1] -> [1, 1, 1]
            => This represents, counting the minimum no. of steps required to reduce to 1.
                Approach :-
                1. Find the minimum most element in the array.
                2. Find the steps, so as to reduce each and every element to that minimum element.
                3. return that step.

            Time Complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = nums.length;
        int minMoves = Integer.MAX_VALUE, minElement = Integer.MAX_VALUE, sumElements = 0;
        int i = 0;

        while(i < n){ // O(n)
            sumElements += nums[i]; // 1. Find the minimum most element in the array.
            minElement = Math.min(minElement, nums[i]); // 2. Find the steps, so as to reduce each and every element to that minimum element.

            i++;
        }

        // return the minimum number of moves required to make all array elements equal.
        minMoves = sumElements - (n * minElement);

        return(minMoves);
    }
}