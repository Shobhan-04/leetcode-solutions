class Solution {
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void moveZeroes(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = nums.length;
        int left = 0;

        for(int right = 0; right < n; right++){
            int rightNum = nums[right];

            if(rightNum != 0){
                swap(nums, left, right);
                left++;
            }
        }
    }
}