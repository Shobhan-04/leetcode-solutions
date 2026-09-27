class Solution {
    public int mySqrt(int x) {
        /*
            Using Binary Search Approach :-

                Time complexity = O(log(n)), 
                Space complexity = O(1)
        */

        long left = 1, right = x, result = 1;

        // Base condition :-
        if(x == 0) return 0;

        while(left <= right){
            long mid = right + (left - right) / 2;
            long midSquare = (mid * mid); 

            if(midSquare > x){ // check whether 
                right = (mid - 1);
            }else{
                result = mid;
                left = (mid + 1);
            }
        }

        return (int) result;
    }
}