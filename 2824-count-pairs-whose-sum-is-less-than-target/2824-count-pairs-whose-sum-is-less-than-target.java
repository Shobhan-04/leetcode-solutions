class Solution {
    public int countPairs(List<Integer> nums, int target) {
        /*
            Two pointer approach :-
                Time complexity = O(n log(n)), 
                Space complexity = O(1) 
        */
        
        int n = nums.size();
        int left = 0, right = (n - 1);
        int noOfPairs = 0;

        Collections.sort(nums); // O(n log(n))

        while(left <= right){
            if(nums.get(left) + nums.get(right) < target){
                noOfPairs += (right - left);
                left++;
            }else{
                right--;
            }
        }

        return(noOfPairs);
    }
}