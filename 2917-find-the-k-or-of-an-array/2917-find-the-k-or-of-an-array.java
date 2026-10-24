class Solution {
    public int findKOr(int[] nums, int k) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = nums.length;

        int bit = 0, kOrNums = 0;

        while(bit < 31){ // O(31)
            int count = 0, j = 0;

            while(j < n){ // O(n)
                int num = nums[j];
                /* 
                    (num & (1 << bit)) This checks whether the bit at position bit is set to 1 in num.
                    - 1 << bit: Shifts 1 left by bit positions to create a bit mask. 
                    - num & mask: Uses bitwise AND to check whether that bit is set.
                */

                if((num & (1 << bit)) != 0) count++;

                j++;
            }

            // In K-or, a bit position in the result is set to 1 if at least k numbers in nums have a 1 in that position :-
            if(count >= k) kOrNums |= (1 << bit); // This sets the bit at position bit to 1 in kOrNums.

            bit++;
        }

        return kOrNums; // Return the K-or of nums.
    }
}