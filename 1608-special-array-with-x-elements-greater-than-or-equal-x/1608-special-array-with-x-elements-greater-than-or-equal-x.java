class Solution {
    public int binarySearch(int[] nums, int target){
        int n = nums.length;
        int left = 0, right = (n - 1);
        int firstIdx = -1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] >= target){
                firstIdx = mid;
                right = (mid - 1);
            }else{
                left = (mid + 1);
            }
        }

        return(firstIdx);
    }

    public int specialArray(int[] nums) {
        /*
            Time complexity = O(n log(n)), 
            Space complexity = O(1)
        */
        
        int n = nums.length;
        int x = 1;

        Arrays.sort(nums); // O(n log(n))

        while(x <= n){ // O(n)
            int firstIndex = binarySearch(nums, x); // O(log(n))
           
            int count = (n - firstIndex);
            if(count == x) return(x);

            x++;
        }

        return(-1);
    }
}