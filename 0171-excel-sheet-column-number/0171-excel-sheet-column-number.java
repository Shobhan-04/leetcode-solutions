class Solution {
    public int titleToNumber(String columnTitle) {
        /*
        DRY RUN :-
            E.g. (i) , result = 0 , columnTitle = AB
            => result = (0 * 26 + 1) => result = 1
            => result = (1 * 26 + 2) => result = 28 (Ans)

            E.g. (ii) , result = 0 , columnTitle = ABC
            => result = (0 * 26 + 1) => result = 1
            => result = (1 * 26 + 2) => result = 28 
            => result = (28 * 26 + 3) => result = (728 + 3) => result = 731 (Ans)

            E.g. (iii) , result = 0 , columnTitle = ZY
            => result = (0 * 26 + 26) => result = 26
            => result = (26 * 26 + 25) => result = (676 + 25) => result =  701 (Ans)

            ==> Generalized Formulae :-
                result = (result * 26) + (ch - 'A') + 1

            ALGORITHM ANALYSIS :-
                Time Complexity = O(n)
                Space Comlexity = O(1)
        */

        int n = columnTitle.length(), columnNumber = 0;

        for(int i = 0; i < n; i++){
            char ch = columnTitle.charAt(i);
            int charIndex = (ch - 'A') + 1; // Excel is 1-indexed.

            columnNumber = (columnNumber * 26) + (charIndex);
        }

        return columnNumber;
    }
}