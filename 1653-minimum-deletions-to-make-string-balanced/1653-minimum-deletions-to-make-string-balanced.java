class Solution {
    public int minimumDeletions(String s) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for the stack.
        */
        
        int n = s.length();
        int minDeletions = 0;

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < n; i++){ // O(n)
            char sCh = s.charAt(i);

            if(!stack.isEmpty() && sCh == 'a' && stack.peek() == 'b'){
                stack.pop();
                minDeletions++;
            }else stack.push(sCh);
        }

        return minDeletions;
    }
}