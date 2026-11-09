class Solution {
    public int minOperations(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for the Stack.
        */
        
        int n = nums.length;
        int operationsCount = 0;
        Stack<Integer> stack = new Stack<>();

        // Seed the stack with 0 as a baseline reference point
        stack.push(0);

        for(int i = 0; i < n; i++){ // O(n)
            int num = nums[i];

            while(!stack.isEmpty() && stack.peek() > num){
                stack.pop();
            }

            if(stack.isEmpty() || stack.peek() < num){
                operationsCount++;
                stack.push(num);
            }
        }

        return(operationsCount);
    }
}