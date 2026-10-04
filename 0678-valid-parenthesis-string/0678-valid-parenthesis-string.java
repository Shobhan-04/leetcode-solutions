class Solution {
    Boolean[][] dp = new Boolean[101][101];

    public boolean solve(int idx, int open, String s, int n){
        n = s.length();

        // Base case :-
        if(open < 0) return false;
        if(idx == n) return(open == 0);

        if(dp[idx][open] != null) return(dp[idx][open]);

        boolean isValid = false;

        char sCh = s.charAt(idx);

        if(sCh == '*'){
            isValid = isValid || solve(idx + 1, open + 1, s, n); // '*' -> '('
            isValid = isValid || solve(idx + 1, open, s, n); // '*' -> ''
            
            if(open > 0){
                isValid = isValid || solve(idx + 1, open - 1, s, n);  // '*' -> ')'
            } 
        }else if(sCh == '('){
            // Increase open count :-
            isValid = solve(idx + 1, open + 1, s, n); // '*' -> '('
        }else if(sCh == ')'){
            // decrease open count :-
            if(open > 0) isValid = solve(idx + 1, open - 1, s, n); // '*' -> ')'
            else isValid = false;
        }else{
            isValid = solve(idx + 1, open, s, n); // '*' -> ''
        }

        return(dp[idx][open] = isValid);
    }

    public boolean checkValidString(String s) {
        int n = s.length();
        return(solve(0, 0, s, n));
    }
}