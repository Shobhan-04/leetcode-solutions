class Solution {
    public boolean isValidParantheses(StringBuilder s){
        int n = s.length(), countParantheses = 0;

        for(int i = 0; i < n; i++){
            char sCh = s.charAt(i);

            if(sCh == '('){
                countParantheses++;
            }else{
                countParantheses--;

                if(countParantheses < 0) return false;
            }
        }

        return countParantheses == 0;
    }

    List<String> result = new ArrayList<>();

    public void solve(StringBuilder curr, int n){
        int m = curr.length();

        if(m == 2 * n){
            if(isValidParantheses(curr)){
                result.add(curr.toString());
            }

            return;

        }

        curr.append('('); // Do something.
        solve(curr, n); // Explore
        curr.deleteCharAt(curr.length() - 1); // Undo something.

        curr.append(')'); // Do something.
        solve(curr, n); // Explore
        curr.deleteCharAt(curr.length() - 1); // Undo something.
    }

    public List<String> generateParenthesis(int n) {
        /*
            Time complexity = O(2^2n * 2n) = O(2^n), 
            Space complexity = O(n)
        */
                
        StringBuilder curr = new StringBuilder();

        solve(curr, n);

        return result;
    }
}