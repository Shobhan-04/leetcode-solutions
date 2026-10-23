class Solution {
    public int sortPermutation(int[] nums) {
        /* 
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = nums.length;

        int i = 0, k = -1;

        while(i < n){ // O(n)
            int num = nums[i];

            if(num != i){
                k &= num; // Update k.
            }

            i++;
        }

        return(k == -1 ? 0 : k);
    }
}