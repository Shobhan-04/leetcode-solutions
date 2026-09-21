class Solution {
    // public boolean isVowel(char ch){
    //     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
    //     {
    //         return true;
    //     }

    //     return false;
    // }

    public int findTheLongestSubstring(String s) {
        /*
            Time complexity = O(n), Space complexity = O(n)
        */
        
        int n = s.length();

        int[] vowelFreq = new int[5]; // vowels frequency count array.
        Arrays.fill(vowelFreq, 0); // Initialize the vowels frequency count with 0.

        String currentState = "00000"; 
        HashMap<String, Integer> map = new HashMap<>();
        map.put(currentState, -1); // Initialize the map with the current state with -1.
        
        int longestSubStr = 0;

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);

            if(ch == 'a') vowelFreq[0] = (vowelFreq[0] + 1) % 2;
            else if(ch == 'e') vowelFreq[1] = (vowelFreq[1] + 1) % 2;
            else if(ch == 'i') vowelFreq[2] = (vowelFreq[2] + 1) % 2;
            else if(ch == 'o') vowelFreq[3] = (vowelFreq[3] + 1) % 2;
            else if(ch == 'u') vowelFreq[4] = (vowelFreq[4] + 1) % 2;

            // Build current parity state :-
            currentState = "";
            for(int j = 0; j < 5; j++){
                currentState += vowelFreq[j];
            }

            if(map.containsKey(currentState)){ // check currentState exists in map.
                // Return the maximum of longestSubStr, and currentState from map after substracting with each element of s.
                longestSubStr = Math.max(longestSubStr, i - map.get(currentState));
            }else{
                map.put(currentState, i); // Store only the first sequence.
            }
        }

        return longestSubStr;
    }
}