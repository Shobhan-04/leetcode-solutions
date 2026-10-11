class Solution {
    public int sumOfSquares(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = nums.length;
        int i = 0;
        int sumOfSpecialSquares = 0;

        while(i < n){
            int num = nums[i];
            
            // An element nums[i] of nums is called special if i divides n, i.e. n % i == 0.
            if(n % (i + 1) == 0){ // condition for special element.
                sumOfSpecialSquares += (num * num);
            }

            i++;
        }

        return sumOfSpecialSquares; // Return the sum of the squares of all special elements of nums.
    }
}