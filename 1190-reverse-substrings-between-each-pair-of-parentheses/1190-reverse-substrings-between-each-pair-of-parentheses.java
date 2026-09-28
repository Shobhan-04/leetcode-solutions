class Solution {
    public String reverseParentheses(String s) {
        /*
            Time complexity = O(n^2), 
            Space complexity = O(n) -> Auxilliay space for Stack and StringBuilder.
        */
        
        int n = s.length();
        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++){ // O(n)
            char sCh = s.charAt(i);
            int m = result.length();

            if(sCh == '('){
                stack.push(m); // store the starting content of the substring inside the parantheses. 
            }else if(sCh == ')'){
                // Reverse the substring inside parantheses :-
                int left = stack.pop(); // Store the top element of the stack.
                int right = (m - 1); // Get the last character of the substring.

                while(left < right){ // O(n)
                    char leftCh = result.charAt(left);
                    char rightCh = result.charAt(right);

                    char temp = leftCh;
                    result.setCharAt(left, rightCh);
                    result.setCharAt(right, temp);

                    left++;
                    right--;
                }
            }else{
                result.append(sCh);
            }
        }

        return result.toString(); // Retun the string not containing any brackets.
    }
}