class Solution {
    public String countAndSay(int n) {
        /*
            Eg. 3322251 -> Two 3's, Three 2's, One 5, One 1. 
                        -> "23"+ "32" + "15" + "11" = "23321511".

            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for StringBuilder. 
        */
        
        if(n == 1) return "1";
        String say = countAndSay(n - 1); // Recursively calculates the next RLE expression
        int m = say.length();

        StringBuilder result = new StringBuilder(); 
        int count = 1; // Initializing as 1, to count the frequency of the characters in the say string.

        for(int i = 0; i < m; i++){ // O(m)
            if(i + 1 < m && say.charAt(i) == say.charAt(i + 1)) count++;
            else{
                result.append(count).append(say.charAt(i));
                count = 1; // Re-initializing count for the next iteration.
            }
        }

        return result.toString();
    }
}