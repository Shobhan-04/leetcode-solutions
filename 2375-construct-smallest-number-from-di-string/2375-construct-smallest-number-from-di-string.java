class Solution {
    public String smallestNumber(String pattern) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for Stack.
        */
        
        int n = pattern.length();
        int i = 0;

        StringBuilder num = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int counter = 1;

        while(i < n){ // O(n)
            char patternCh = pattern.charAt(i);
           
            stack.push((char) (counter + '0'));
            counter++;
            
            if(patternCh == 'I'){
                while(!stack.isEmpty()){
                    // pop all elements currently in the stack when you encounter I, appending each popped digit to the num.
                    char topElem = stack.pop();
                    num.append(topElem);
                }
            }

            i++;
        }

        stack.push((char) (counter + '0')); // push all elements currently into the stack when you encounter D.

        // pop all remaining elements from the stack, appending each popped digit to the num.
        while(!stack.isEmpty()){
            char topElem = stack.pop();
            num.append(topElem);
        }

        return(num.toString()); // Return the lexicographically smallest possible string num that meets the conditions.
    }
}