class Solution {
    public boolean divideArray(int[] nums) {
        /*
            Time complexity = O(n log(n)), 
            Space complexity = O(1)
        */
        
        int n = nums.length;

        Arrays.sort(nums); // O(n log(n))

        for(int i = 0; i < n; i += 2){ // O(n)
            if(nums[i] != nums[i + 1]) return false;
        }

        return true;
    }
}