class Solution {
    public int maxDepth(String s) {
        /*
            Time complexity = O(n), 
            Space comlexity = O(n) -> Auilliary space for storing the characers into the stack.
        */
        
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        int result = 0;

        for(int i = 0; i < n; i++){ // O(n)
            char sCh = s.charAt(i); // getting the character at each index.

            if(sCh == '(') stack.push(sCh); // push the character into the stack.
            else if(sCh == ')') stack.pop(); // pop the charcter from the stack.

            // The nesting depth is the maximum number of nested parentheses in the stack.
            result = Math.max(result, stack.size());
        }

        return result; // Return maximum nesting depth of the parantheses.
    }
}