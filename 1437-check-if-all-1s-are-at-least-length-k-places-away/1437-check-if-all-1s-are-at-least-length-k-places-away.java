class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = nums.length;
        int lastOne = -(k + 1);

        int i = 0;

        while(i < n){
            int num = nums[i];
            
            if(num == 1){
                if(i - lastOne - 1 < k) return false;
                lastOne = i;
            }

            i++;
        }

        return true;
    }
}