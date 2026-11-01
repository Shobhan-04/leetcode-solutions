class Solution {
    public int xorRange(int N){
        int result = 0;

        // Base condition :-
        if(N < 0) return 0;

        if(N % 4 == 0) result = N;
        else if(N % 4 == 1) result = 1;
        else if(N % 4 == 2) result = (N + 1);
        else if(N % 4 == 3) result = 0;

        return result;
    }

    public int xorOperation(int n, int start) {
        /*
            Time complexity = O(1), 
            Space complexity = O(1)
        */

        int bitwiseXorResult = 0;

        int s = start >> 1;
        int end = (s + n - 1);
        bitwiseXorResult = xorRange(s-1) ^ xorRange(end);

        return bitwiseXorResult << 1 | ((n & 1) * (start & 1));
    }
}