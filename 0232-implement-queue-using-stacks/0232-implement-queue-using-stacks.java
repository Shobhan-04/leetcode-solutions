class MyQueue {
    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    public MyQueue() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    private void shiftStacks(){
        if(outputStack.isEmpty()){
            while(!inputStack.isEmpty()){
                outputStack.push(inputStack.pop());
            }
        }
    }
    
    public void push(int x) {
        inputStack.push(x);
    }
    
    public int pop() {
        shiftStacks(); 
        return(outputStack.pop());
    }
    
    public int peek() {
        shiftStacks();
        return(outputStack.peek());
    }
    
    public boolean empty() {
        return(inputStack.isEmpty() && outputStack.isEmpty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */