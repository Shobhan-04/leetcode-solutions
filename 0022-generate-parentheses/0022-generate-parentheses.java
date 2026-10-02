class Solution {
    public void solve(int n, int open, int close, StringBuilder curr, List<String> result)
    {
        int m = curr.length();

        if(m == 2 * n){ // Base condition 
            result.add(curr.toString()); // Add the open and close parantheses as it is.
            return;
        }

        if(open < n){ // Add '(' 
            curr.append('('); // Append '(' into the StringBuilder.
            solve(n, open + 1, close, curr, result); // Recursive function for open.
            curr.deleteCharAt(curr.length() - 1); // Backtrack
        }

        if(close < open){ // Add ')'
            curr.append(')'); // Append ')' into the StringBuilder.
            solve(n, open, close + 1, curr, result); // Recursive function for close.
            curr.deleteCharAt(curr.length() - 1); // Backtrack
        }
    }

    public List<String> generateParenthesis(int n) {
        /*
            Time complexity = O(2 * n) = O(n), 
            Space complexity = O(n) 
        */
        
        StringBuilder sb = new StringBuilder();
        List<String> result = new ArrayList<>();

        solve(n, 0, 0, sb, result);
        return result;
    }
}