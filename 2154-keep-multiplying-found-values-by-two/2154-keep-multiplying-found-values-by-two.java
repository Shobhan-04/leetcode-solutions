class Solution {
    public int binarySearch(int[] nums, int target){
        int n = nums.length;
        int left = 0, right = (n - 1);

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = (mid + 1);
            }else{
                right = (mid - 1);
            }
        }

        return -1;
    }
    public int findFinalValue(int[] nums, int original) {
        /*
            Time complexity = O(n log(n)), 
            Space complexity = O(1)
        */
        
        int n = nums.length;
        Arrays.sort(nums); // O(n log(n))
        
        while(binarySearch(nums, original) != -1) original *= 2;

        return original;
    }
}