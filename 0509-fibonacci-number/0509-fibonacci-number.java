class Solution {
    public int fib(int n) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        if(n == 0 ) return 0;
        if(n == 1) return 1;

        int prev2 = 0, prev1 = 1;

        int i = 2;
        int result = 0;

        while(i <= n){
            result = (prev2 + prev1);
            prev2 = prev1;
            prev1 = result;

            i++;
        }

        return result;
    }
}