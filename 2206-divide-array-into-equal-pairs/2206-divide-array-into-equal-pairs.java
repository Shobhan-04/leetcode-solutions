class Solution {
    public boolean divideArray(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = nums.length;
        int[] freq = new int[501]; 
        int count = 0;

        for(int i = 0; i < n; i ++){ // O(n)
            int num = nums[i];
            freq[num]++;
        }

        for(int i = 0; i < freq.length; i++){
            if(freq[i] % 2 != 0) return false;
        }

        return true;
    }
}