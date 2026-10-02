class Solution {
    public boolean isValid(String s) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for Stack.
        */
        
        int n = s.length();
        Stack<Character> stack = new Stack<>();
 
        for(int i = 0; i < n; i++){ // O(n)
            char sCh = s.charAt(i);

            if(sCh == '(' || sCh == '[' || sCh == '{') stack.push(sCh);
            
            else{
                if(stack.isEmpty()) return false;

                int topElem = stack.pop();
                
                if(sCh == ')' && topElem != '(') return false;
                if(sCh == ']' && topElem != '[') return false;
                if(sCh == '}' && topElem != '{') return false;
            }
        }

        return stack.isEmpty();
    }
}