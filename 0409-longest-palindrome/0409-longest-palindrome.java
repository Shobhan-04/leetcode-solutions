class Solution {
    public int longestPalindrome(String s) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxillary space for HashMap.
        */
        
        int n = s.length();
        int lenLongestPalindrome = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        // Store the character and their frequency count into the HashMap in <K, V> pairs.
        for(int i = 0; i < n; i++){ // O(n)
            char sCh = s.charAt(i);
            map.put(sCh, map.getOrDefault(sCh, 0) + 1);
        }

        boolean oddChar = false;

        // Iterate over the map :-
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            char key = entry.getKey();
            int val = entry.getValue();

            if(val % 2 == 0){ // check for even count.
                lenLongestPalindrome += val; // add those val into lenLongestPalindrome.
            }else{ // check for odd count.
                lenLongestPalindrome += (val-1);
                oddChar = true;
            }
        }

        // If the oddChar still exists :-
        if(oddChar == true) lenLongestPalindrome ++;

        return lenLongestPalindrome; // return the length of the longest palindrome t
    }
}