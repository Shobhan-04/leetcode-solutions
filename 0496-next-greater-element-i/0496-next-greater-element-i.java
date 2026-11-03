class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        /*
            Time complexity = O(n + m), 
            Space complexity = O(n) -> Auxilliary space for the stack and HashMap. 
        */
        
        int m = nums1.length, n = nums2.length;

        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate backward from [n-1, 0] :-
        for(int i = n-1; i >= 0; i--){ // O(n)
            int num2 = nums2[i];

            // check whether the length of the stack > 0 and the top element is <= num2.
            while(!stack.isEmpty() && stack.peek() <= num2){
                stack.pop(); // then, pop that element from the stack.
            }

            // If stack is empty then, put -1 at that element corresponding to num2 into the map :-
            if(stack.isEmpty()) map.put(num2, -1);

            // If stack is not empty then, put the top most element in the stack that is maximum element to right of the current element, into the map :-
            else map.put(num2, stack.peek());

            stack.push(num2); // otherwise, add num2 into the stack.
        }

        int[] ans = new int[m]; // size of ans = size of nums1.
        
        for(int i = 0; i < m; i++){ // O(m)
            int num1 = nums1[i]; 
            ans[i] = map.get(num1); // store the element in num1 which is present in num2.
        }

        return ans; // Return an array ans of length nums1.length such that ans[i] is the next greater element as described abov
    }
}