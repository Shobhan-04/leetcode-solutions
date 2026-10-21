class Solution {
    public int longestPalindrome(String s) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxillary space for HashMap.
        */
        
        int n = s.length();
        int lenLongestPalindrome = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int oddFreqCount = 0;

        // Store the character and their frequency count into the HashMap in <K, V> pairs.
        for(int i = 0; i < n; i++){ // O(n)
            char sCh = s.charAt(i);
            map.put(sCh, map.getOrDefault(sCh, 0) + 1);

            int value = map.get(sCh);
            if(value % 2 != 0) oddFreqCount++;
            else oddFreqCount--; 
        }

        if(oddFreqCount >= 1){
            lenLongestPalindrome = (n - oddFreqCount + 1);
        }else{
            lenLongestPalindrome = n;
        }

        return lenLongestPalindrome; // return the length of the longest palindrome t
    }
}