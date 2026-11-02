import java.util.regex.*;
import java.math.*;

class Solution {
    public int numDifferentIntegers(String word) {
        /*
            Time complexity = O(n),
            Space complexity = O(n) -> Auxilliary space for storing the unique integers after performing the replacement operations on word.
        */
        
        int n = word.length();

        int i = 0;

        // For storing the unique integers after performing the replacement operations on word :-
        HashSet<String> uniqueIntegerSet = new HashSet<>(); 

        while(i < n){ // O(n)
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(word);

            while(matcher.find()){
                BigDecimal bd = new BigDecimal(matcher.group());
                // Two integers are considered different if their decimal representations without any leading zeros are different. 
                bd = bd.stripTrailingZeros(); // remove the trailing zeros from the bd.
                uniqueIntegerSet.add(bd.toPlainString());
            }

            i++;
        }

        // Return the number of different integers after performing the replacement operations on word.
        return(uniqueIntegerSet.size()); // Returns the set size.
    }
}