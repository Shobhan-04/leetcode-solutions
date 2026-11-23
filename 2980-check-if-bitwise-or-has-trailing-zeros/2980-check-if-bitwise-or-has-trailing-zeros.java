class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = nums.length;
        int evenCount = 0;

        for(int i = 0; i < n; i++){ // O(n)
            int num = nums[i];

            // A number has a trailing zero iff it is an even number :-
            if((num & 1) == 0) evenCount++;

            // If evenCount == 2 then, 
            if(evenCount == 2) return true;
        }

        return false;
    }
}