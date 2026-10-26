class Solution {
    public int minLength(String s) {
        /*
        Better approach :-
        
            Note :- In order to delete any character within the string we must use Stack as the Data Structure.

                Time complexity = O(n), 
                Space complexity = O(n)
        */
        
        int n = s.length();
        int i = 0, minPossibleLength = -1;

        Stack<Character> stack = new Stack<>(); // O(n)

        while(i < n){
            char sCh = s.charAt(i);

            /* 
            LOGIC :-

            Check until the stack is not empty and along with satisfying the following conditions :-
                1. If sCh is 'B' and the top most element in the stack is 'A' then pop that topmost element from the stack.
                2. If sCh is 'D' and the top most element in the stack is 'C' then pop that topmost element from the stack.
            */
            if(!stack.isEmpty() && ((sCh == 'B' && stack.peek() == 'A') || (sCh == 'D' && stack.peek() == 'C')))
            {
                stack.pop(); // We can remove any occurrence of one of the substrings "AB" or "CD" from s.
            }
            
            // otherwise, push the other characters into the stack except "AB" and "CD" : 
            else{ 
                stack.push(sCh);
            }

            i++;
        }

        minPossibleLength = stack.size(); // Stack stores the minimum characters after removing the substrings "AB" and "CD", that is our required answer. So, return the length of the stack.

        return(minPossibleLength); // Return the minimum possible length of the resulting string that we can obtain.
    }
}