class Solution {
    public int minMoves2(int[] nums) {
        /*
            Time complexity = O(n log(n)) + O(n) = O(n log(n)), 
            Space complexity = O(n)
        */
        
        int n = nums.length;
        int i = 0;

        Arrays.sort(nums); // O(n log(n))

        int mid = nums[n / 2];

        int minMoves = 0;

        while(i < n){ // O(n)
            minMoves += Math.abs(nums[i] - mid);
            i++;
        }
        
        return minMoves;
    }
}