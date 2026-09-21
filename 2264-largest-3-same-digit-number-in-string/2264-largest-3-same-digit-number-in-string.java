class Solution {
    public String largestGoodInteger(String num) {
        /*
            Two Pointer Approach :-
                Time complexity = O(n), 
                Space complexity = O(1) 
        */
        
        int n = num.length();
        int left = 0, right = 2;
        String result = "";

        while(right < n){
            char numCh = num.charAt(left);
            char numChNext = num.charAt(left + 1);
            char numChNextNext = num.charAt(left + 2);

            if(numCh == numChNext && numChNext == numChNextNext && numChNextNext == numCh)
            {
                if(result.isEmpty() || numCh > result.charAt(0))
                {
                    result = "" + numCh + numCh + numCh;
                }
            }

            left++;
            right++;
        }

        return result;
    }
}