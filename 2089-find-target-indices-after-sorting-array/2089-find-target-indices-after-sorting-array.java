class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n = nums.length, i = 0, elemsCount = 0;

        // Finding those elements from the nums, whose value is less than the target :-
        while(i < n){
            int num = nums[i];
            if(num < target) elemsCount++; // Increment the count for that particular element.

            i++;
        }

        i = 0;

        List<Integer> resultLst = new ArrayList<>();

        while(i < n){
            // Check if the element in the nums equals to target then, 
            if(nums[i] == target){
                resultLst.add(elemsCount); // Add the count into the resultLst.
                elemsCount++; // Increment the count of that element after adding into the resultLst.
            }

            i++;
        }

        return resultLst; // Return a list of the target indices of nums after sorting nums in non-decreasing order. 
    }
}