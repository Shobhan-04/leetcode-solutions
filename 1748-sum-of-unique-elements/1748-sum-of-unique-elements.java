class Solution {
    public int sumOfUnique(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n)
        */
        
        int n = nums.length;
        int sumUniqueElems = 0;

        HashSet<Integer> uniqueSet = new HashSet<>();
        HashSet<Integer> duplicateSet = new HashSet<>();

        for(int i = 0; i < n; i++){
            int num = nums[i];

            // If duplicate set already contains that element then skip that element from adding once again into it using the continue statement :-
            if(duplicateSet.contains(num)) continue;

            // If its already in the uniqueset then, its appearing for the second time :-
            if(uniqueSet.contains(num)){
                sumUniqueElems -= num; // Subtract it out of the sum completly.
                uniqueSet.remove(num); // Remove it from the uniqueSet.
                duplicateSet.add(num); // Exclude that element permanently by adding that element into the duplicateSet.
            }else if(!uniqueSet.contains(num)){ // Number seen for the first time 
                sumUniqueElems += num; // Add it to the running sum.

                // The unique elements of an array are the elements that appear exactly once in the array.
                uniqueSet.add(num); // Add num into the uniqueSet.
            }
        }

        return sumUniqueElems; // Return the sum of all the unique elements of nums.
    }
}