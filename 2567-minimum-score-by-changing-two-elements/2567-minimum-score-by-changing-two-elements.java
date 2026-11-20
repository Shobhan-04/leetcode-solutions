class Solution {
    public int minimizeSum(int[] nums) {
        /*
            Time complexity = O(n log(n)), 
            Space complexity = O(1)
        */
        
        int n = nums.length;
        int minimumAbsScore = Integer.MAX_VALUE;
        int case1 = Integer.MAX_VALUE, case2 = Integer.MAX_VALUE;
        int case3 = Integer.MAX_VALUE;

        Arrays.sort(nums); // O(n log(n))

        /* Case - 1: Substituting the 2nd starting and the 2nd ending element as the first and the ending most elements of the nums array :- 
            nums[n-2] = nums[n-1];
            nums[1] = nums[0];
        */
        case1 = Math.abs(nums[n-2] - nums[1]);

        /* Case 2: Substituting the nums[n-1] and nums[n-2] element as the nums[n-3] element in the nums array :-
            nums[n-1] = nums[n-3];
            nums[n-2] = nums[n-3];
        */
        case2 = Math.abs(nums[n-3] - nums[0]);

        /* Case 3: Substituting the nums[0] and nums[1] element as the nums[2] element in the nums array :-
            nums[0] = nums[2];
            nums[1] = nums[2];
        */
        case3 = Math.abs(nums[n-1] - nums[2]);

        minimumAbsScore = Math.min(case1, Math.min(case2, case3));

        return minimumAbsScore;
    }
}