class Solution {
    public int findFinalValue(int[] nums, int original) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for HashSet.
        */
        
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        // Store the elements of array into the HashSet :-
        for(int i = 0; i < n; i++){
            set.add(nums[i]);
        }

        // Repeat this process with the new number as long as you keep finding the number.
        while(set.contains(original)){
            original *= 2; // If original is found in nums, multiply it by two (i.e., set original = 2 * original).
        }

        return original; // Return the final value of original.
    }
}