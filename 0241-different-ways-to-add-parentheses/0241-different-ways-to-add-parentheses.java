class Solution {
    public List<Integer> solve(String expression){
        int n = expression.length();
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < n; i++){
            char expressionCh = expression.charAt(i);

            if(expressionCh == '-' || expressionCh == '+' || expressionCh == '*'){
                List<Integer> leftResult = solve(expression.substring(0, i));
                List<Integer> rightResult = solve(expression.substring(i+1));

                for(int x : leftResult){
                    for(int y : rightResult){
                        if(expressionCh == '-') result.add(x - y);
                        else if(expressionCh == '+') result.add(x + y);
                        else if(expressionCh == '*') result.add(x * y);
                    }
                }
            }
        }

        if(result.isEmpty()){
            result.add(Integer.parseInt(expression));
        }

        return result;
    }

    public List<Integer> diffWaysToCompute(String expression) {
        /*
            Time complexity = O(n * (2 ^ n)), 
            Space complexity = O(n) -> For the resultant ArrayList.
        */
        
        List<Integer> result = solve(expression);
        return result;
    }
}