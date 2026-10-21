class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1) -> Excluding the list.
        */
        
        int n = nums.length, i = 0, elemsCount = 0;

        // Finding those elements from the nums, whose value is less than the target :-
        while(i < n){ // O(n)
            int num = nums[i];
            if(num < target) elemsCount++; // Increment the count for that particular element.

            i++;
        }

        i = 0;

        List<Integer> resultLst = new ArrayList<>();

        // Finding those elements from the nums, whose value is equal to target :-
        while(i < n){ // O(n)
            int num = nums[i];
            
            // Check if the element in the nums equals to target then, 
            if(num == target){
                resultLst.add(elemsCount); // Add the count into the resultLst.
                elemsCount++; // Increment the count of that element after adding into the resultLst.
            }

            i++;
        }

        return resultLst; // Return a list of the target indices of nums after sorting nums in non-decreasing order. 
    }
}