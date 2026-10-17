class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for storing the nums[i] and index[i] into the ArrayList.
        */
        
        int n = nums.length;
        ArrayList<Integer> arrList = new ArrayList<>();

        int i = 0;

        while(i < n){ // O(n)
            arrList.add(index[i], nums[i]); // Adding all the index and nums array elements into the arrList.
            i++;
        }

        int m = arrList.size();
        int[] target = new int[m];

        i = 0;

        while(i < n){ // Repeat the below step until there are no elements left to read in nums and index.
            // From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
            target[i] = arrList.get(i);
            i++;
        }

        return target; // Return the target array.
    }
}