class Solution {
    public int addDigits(int num) {
        /*
            Time complexity = O(1), 
            Space complexity = O(1)
        */
        
        if(num == 0) return 0;
        return(1 + (num - 1) % 9); // for any num > 0.
    }
}