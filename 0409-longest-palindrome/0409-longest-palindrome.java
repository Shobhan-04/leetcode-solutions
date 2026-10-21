class Solution {
    public int longestPalindrome(String s) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxillary space for HashSet.
        */
        
        int n = s.length();
        int lenLongestPalindrome = 0;

        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < n; i++){ // O(n)
            char sCh = s.charAt(i);

            // If sCh is already present in the set :-
            if(set.contains(sCh)){
                lenLongestPalindrome += 2; // Increment the count by 2.
                set.remove(sCh); // then, remove that character from the set which have the even count.
            }else{ // If sCh is not present in the set :-
                set.add(sCh); // add sCh into the set.
            }
        }

        if(!set.isEmpty()){ // If set contains some character,
            lenLongestPalindrome++; // then increment the length of the longest palindrome
        }

        return lenLongestPalindrome; // return the length of the longest palindrome t
    }
}