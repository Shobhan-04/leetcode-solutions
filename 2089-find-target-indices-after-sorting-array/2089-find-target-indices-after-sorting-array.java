class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        /*
            Time complexity = O(n log(n)) -> After sorting the array elements. 
            Space complexity = O(1) -> After sorting the array elements, by excluding the resultant array.
        */
        
        int n = nums.length;

        int i = 0;

        List<Integer> result = new ArrayList<>();

        Arrays.sort(nums); // O(n log(n))

        while(i < n){ // O(n)
            int num = nums[i];

            if(num == target){ // A target index is an index i such that nums[i] == target.
                result.add(i);
            }else if(num > target){
                return result; // Return the empty list as it is.
            }

            i++;
        }

        return result; // Return a list of the target indices of nums after sorting nums in non-decreasing order. The returned list must be sorted in increasing order.
    }
}