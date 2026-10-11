class Solution {
    public String removeOuterParentheses(String s) {
        /*
        Time complexity = O(n), 
        Space complexity = O(n) -> Auxilliary space for StringBuilder.
        */
        
        int n = s.length();
        int bracketsCount = 0;
        StringBuilder result = new StringBuilder();

        int i = 0;

        while(i < n){
            char sCh = s.charAt(i);
            
            if(sCh == '('){
                if(bracketsCount != 0) result.append(sCh);
                bracketsCount++; // Increment, if we encounter open parantheses.
            }else{
                bracketsCount--; // Decrement, if we encounter closed parantheses.
                if(bracketsCount != 0) result.append(sCh);
            }

            i++;
        }

        return result.toString();
    }
}