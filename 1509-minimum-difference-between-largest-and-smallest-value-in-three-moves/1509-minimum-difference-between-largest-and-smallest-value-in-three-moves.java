class Solution {
    public int minDifference(int[] nums) {
        /*
            Approach :-
            nums = {0,2,3,5,6,10,11,14}
                14-> 6, 11-> 6, 10-> 6 => (nums[n-4] - nums[0]) = (6-0) = 6 (min)
                0-> 2, 14-> 10, 11-> 10 => (nums[n-3] - nums[1]) = (10-2) = 8
                14-> 11, 2-> 3, 0-> 3 => (nums[n-2] - nums[2]) = (11-3) = 8
                0-> 5, 1-> 5, 2-> 5 => (nums[n-1] - nums[3]) = (14-5) = 9 

                Time complexity = O(n log(n)), 
                Space complexity = O(1)
        */
        
        int n = nums.length;
        int minDiff = Integer.MAX_VALUE;

        if(n <= 4) return 0;

        int i = 0;

        Arrays.sort(nums);

        while(i < n){
            int num = nums[i];
            minDiff = Math.min(minDiff, (nums[n-4] - nums[0]));
            minDiff = Math.min(minDiff, (nums[n-3] - nums[1]));
            minDiff = Math.min(minDiff, (nums[n-2] - nums[2]));
            minDiff = Math.min(minDiff, (nums[n-1] - nums[3]));

            i++;
        }

        return minDiff;
    }
}