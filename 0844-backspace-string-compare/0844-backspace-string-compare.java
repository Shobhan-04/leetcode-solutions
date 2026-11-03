class Solution {
    public boolean backspaceCompare(String s, String t) {
        /*
            Time complexity = O(m + n), 
            Space complexity = O(n) -> Auxilliary space for stack1 and stack2.
        */
        
        int m = s.length(), n = t.length();

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for(int i = 0; i < m; i++){ // O(m)
            char sCh = s.charAt(i);

            if(sCh != '#') stack1.push(sCh);
            else if(sCh == '#' && stack1.size() > 0) stack1.pop() ;
        }

        for(int j = 0; j < n; j++){ // O(n)
            char tCh = t.charAt(j);

            if(tCh != '#') stack2.push(tCh);
            else if(tCh == '#' && stack2.size() > 0) stack2.pop();
        }

        return(stack1.equals(stack2));
    }
}