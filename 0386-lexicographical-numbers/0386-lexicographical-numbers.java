class Solution {
    public void solve(int currentNum, int n, List<Integer> result){
        if(currentNum > n) return; // Base case

        result.add(currentNum); // Adding 1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9

        for(int append = 0; append <= 9; append++){
            int newNum = (currentNum * 10) + append; // 1 -> 10, 11, 12, 13

            // 10 > 13 (F), 11 > 13 (F), 12 > 13 (F),  13 > 13 (F)
            if(newNum > n) return; // 14 > 13 (T) -> return 
            solve(newNum, n, result); // DFS -> Recursion 
        }
    }

    public List<Integer> lexicalOrder(int n) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        List<Integer> result = new ArrayList<>();
 
        for(int startNum = 1; startNum <= 9; startNum++){ // 1, 2, 3, 4, 5, 6, 7, 8, 9
            solve(startNum, n, result);
        }

        return(result);
    }
}