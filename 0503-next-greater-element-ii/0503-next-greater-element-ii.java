class Solution {
    public int[] nextGreaterElements(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for the stack.
        */
        
        int n = nums.length;

        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];
        Arrays.fill(ans,-1);

        int i = (2 * n) - 1;

        // Loop through a virtual array backwards :-
        while(i >= 0){
            int currentNum = nums[i % n]; // Simulate the circular array.

            while(!stack.isEmpty() && stack.peek() <= currentNum){
                stack.pop();
            }

            if(i < n){ // Only populate the array with the top most element in or with the next consecutive greater element to the right of the current element.
                if(!stack.isEmpty()) ans[i] = stack.peek();
            }

            stack.push(currentNum); // Store the currentNum into the stack.

            i--;
        }

        return ans; // return the next greater number for every element in nums.
    }
}