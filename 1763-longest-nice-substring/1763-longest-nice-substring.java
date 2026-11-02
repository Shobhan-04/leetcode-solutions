class Solution {
    public String longestNiceSubstring(String s) {
        /*          
            Time complexity = O(n^2), 
            Space complexity = O(n)
        */
        
        int n = s.length();

        /*
            Traverse the substring and maintain two sets:
            - One set for lowercase letters.
            - One set for uppercase letters.
        */
        HashSet<Character> lowerSet = new HashSet<>();
        HashSet<Character> upperSet = new HashSet<>();

        // Store the lowercase and the uppercase characters in the respectve sets :-
        for(int j = 0; j < n; j++){ // O(n)
            char sCh = s.charAt(j);

            if(Character.isLowerCase(sCh)) lowerSet.add(sCh);
            if(Character.isUpperCase(sCh)) upperSet.add(sCh);
        }

        int i = 0;

        while(i < n){ // O(n)
            char sCh = s.charAt(i);
            /*
                Check each character to determine whether its corresponding opposite-case character exists.
                    - For example, if 'a' exists, 'A' must also exist, and vice versa.
            */

            char lowerCh = Character.toLowerCase(sCh);
            char upperCh = Character.toUpperCase(sCh);
            
            if(!lowerSet.contains(lowerCh) || !upperSet.contains(upperCh)){
                /* Split the current substring at that character into two smaller substrings:
                    - The part before the character.
                    - The part after the character.
                */

                String beforeSubstr = s.substring(0, i);
                String afterSubstr = s.substring(i + 1 , n); 

                // Recursively apply the same process to both parts, for before and after the result.
                String beforeResult = longestNiceSubstring(beforeSubstr);
                String afterResult = longestNiceSubstring(afterSubstr);

                // If both results have equal lengths, return the one occurring earlier in the original string. 
                int beforeSubstringLength = beforeResult.length();
                int afterSubstringLength = afterResult.length();

                if(beforeSubstringLength >= afterSubstringLength) return(beforeResult);
                else return(afterResult);
            }

            i++;
        }   

        return(s);
    }
}