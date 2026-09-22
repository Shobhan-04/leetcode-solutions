class Solution {
    public String makeGood(String s) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for StringBuilder.
        */

        int n = s.length(); // size of s.

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < n; i++){
            char chS = s.charAt(i); // get each character in s.

            int m = result.length(); // size of result.

            /* 
                'A' + 32 => (65 + 32) = 'a' 
                'a' - 32 => (97 - 32) = 'A'
            */ 
            if(m > 0 && (result.charAt(m-1) + 32 == chS|| result.charAt(m-1) - 32 == chS))
            {
                result.deleteCharAt(m - 1); // delete the character at m-1 index.
            }else{
                result.append(chS); // append the character into the result.
            }
        }

        return result.toString(); // convert the StringBuilder into the resultant string.
    }
}