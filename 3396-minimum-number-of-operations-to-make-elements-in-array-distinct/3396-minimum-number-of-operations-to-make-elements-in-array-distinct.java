class Solution {
    public int minimumOperations(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for the set.
        */
        
        int n = nums.length;

        int i = (n - 1);

        HashSet<Integer> set = new HashSet<>();

        while(i >= 0){ // Iterating backwards
            // Check whether from the subarray i till the end contains the duplicate element :-

            int num = nums[i];

            if(set.contains(num)) return (int) Math.ceil((i + 1) / 3.0);
            else set.add(num);

            i--;
        }

        return 0;
    }
}