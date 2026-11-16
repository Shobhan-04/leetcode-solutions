class Solution {
    public String[] divideString(String s, int k, char fill) {
        /*
            Time complexity = O(n + k), 
            Space complexity = O(n + k) -> Auxilliary space for the StringBuilder and by including the result array.
        */
        
        int n = s.length(), resLen = (n + k - 1) / k;
        
        // For E.g. 1 : resLen = (9+3-1) / 3 = 3, E.g. 2: resLen = (10+3-1) / 3 = 4.
        String[] result = new String[resLen]; 
        Arrays.fill(result, null); 
        
        StringBuilder sb = new StringBuilder();
        int resIdx = 0;

        for(int i = 0; i < n; i += k){ // Step by the size k, forming each group.
           int j = i;
           sb.setLength(0); // reset

            // The first group consists of the first k characters of the string, the second group consists of the next k characters of the string, and so on. Each element can be a part of exactly one group :-
            while(j < (i + k) && j < n){
                char sCh = s.charAt(j);
                sb.append(sCh);

                j++;
            }

            // Padding before storing into the result :-
            while(sb.length() < k){ // Check whether the group is less than k.
                sb.append(fill); // For the last group, if the string does not have k characters remaining, a character fill is used to complete the group.
            }

            result[resIdx++] = sb.toString(); // Store all the groups formed into the result.
        }

        return result;// return a string array denoting the composition of every group s 
    }
}