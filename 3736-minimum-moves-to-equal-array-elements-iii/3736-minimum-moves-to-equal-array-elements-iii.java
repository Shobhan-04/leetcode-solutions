class Solution {
    public int minMoves(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = nums.length;

        int i = 0;
        int maxElement = Integer.MIN_VALUE;

        while(i < n){ // O(n)
            maxElement = Math.max(maxElement, nums[i]);
            i++;
        }

        i = 0;
        int minMoves = 0;

        while(i < n){ // O(n)
            minMoves += (maxElement - nums[i]);
            i++;
        }

        return minMoves;
    }
}