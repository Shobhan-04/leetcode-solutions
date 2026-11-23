class Solution {
    public boolean countTrailingZeros(int num){
        String n = Integer.toBinaryString(num);

        if(n.charAt(n.length() - 1) == '0') return true;

        return false;
    }

    public boolean hasTrailingZeros(int[] nums) {
        /*
            Time complexity = O(n^2), 
            Space complexity = O(1)
        */
        
        int n = nums.length;

        int i = 0;

        while(i < n){
            int j = i;

            while(j < n){
                int num = (nums[i] | nums[j]); // Finding the bitwise OR of the elements.

                if(i != j && countTrailingZeros(num)){
                    return true;
                }

                j++;
            }

            i++;
        }

        return false;
    }
}