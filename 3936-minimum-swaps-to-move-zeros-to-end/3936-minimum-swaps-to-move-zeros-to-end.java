class Solution {
    public int minimumSwaps(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = nums.length;
        int minSwaps = 0;
        int left = 0, right = (n - 1);

        while(left < right){
            int leftNum = nums[left], rightNum = nums[right];
            
            if(leftNum != 0) left++; 
            else if(rightNum == 0) right--; // No swap, keep that zero right there.
            else if(leftNum == 0 && rightNum != 0){ // Perform swapping.
                minSwaps++; // Increment the number of swaps.
                left++; // Increment the left pointer.
                right--; // Increment the right pointer.
            }
        }

        return(minSwaps); // Return an integer denoting the minimum number of operations required to move all 0s to the end of the array.
    }
}