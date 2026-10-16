class Solution {
    public int getLucky(String s, int k) {
        /*
            Time complexity = O(n + km), 
            Space complexity = O(n) -> Auxilliary space taken for the StringBuilder.

            E.g. :  s = "zbax" and k = 2
        */
        
        int n = s.length();
        
        int i = 0;
        StringBuilder sb = new StringBuilder();

        // Appending the ascii characters of lowercase letters into the sb :-
        while(i < n){ // O(n)
            char sCh = s.charAt(i);
            sb.append(sCh - ('a' - 1)); // Convert: "zbax" ➝ "(26)(2)(1)(24)" ➝ "262124" ➝ 262124
            i++;
        }

        while(k > 0){ // E.g. k = 2
            int sumOfDigits = 0;
            int m = sb.length();

            /*
                Transform #1: 262124 ➝ 2 + 6 + 2 + 1 + 2 + 4 ➝ 17
                Transform #2: 17 ➝ 1 + 7 ➝ 8 (Ans)
            */
            
            for(i = 0; i < m; i++){
                sumOfDigits += (sb.charAt(i) - '0');
            }

            k--;
            sb = new StringBuilder(String.valueOf(sumOfDigits));
        }

        String result = sb.toString(); // sb(8) -> "8"
        int resultingInt = Integer.parseInt(result); // "8" -> 8

        return resultingInt; // Return the resulting integer after performing the operations described above.
    }
}