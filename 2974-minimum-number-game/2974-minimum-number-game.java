class Solution {
    public int[] numberGame(int[] nums) {
        /*
            Time complexity = O(n log(n)) + O(n) = O(n log(n)), 
            Space complexity = O(1) -> Excluding, the auxilliary space consumed for result
        */
        
        int n = nums.length;
        int[] result = new int[n];
        
        int i = 0;
        Arrays.sort(nums); // O(n log(n))

        while(i < n){ // O(n)
            int elementRemovedByAlice = nums[i];
            int elementRemovedByBob = nums[i+1];

            result[i] = elementRemovedByBob;
            result[i+1] = elementRemovedByAlice;

            i += 2;
        }

        return result;
    }
}