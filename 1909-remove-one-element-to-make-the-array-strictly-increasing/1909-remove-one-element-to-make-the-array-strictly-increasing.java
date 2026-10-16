class Solution {
    public boolean isStrictlyIncreasing(int[] nums, int start, int end) {
        if(start >= end) return true;

        int n = nums.length, i = (start + 1);

        while(i <= end){
            if(nums[i] <= nums[i-1]) return false;
            i++;
        }

        return true;
    }

    public boolean canBeIncreasing(int[] nums) {
        /*
            Brute Force:-
            Time complexity = O(n^2), 
            Space complexity = O(n)
        */
        
        int n = nums.length, i = 0;

        while(i < n){
            int j = 0;
            int[] arr = new int[n-1];
            int idx = 0;

            while(j < n){
                if(i != j){
                    arr[idx] = nums[j];
                    idx++;
                }
                
                j++;
            }

            int m = arr.length;
            if(isStrictlyIncreasing(arr, 0, m-1)) return true;

            i++;
        }

        return false;
    }
}