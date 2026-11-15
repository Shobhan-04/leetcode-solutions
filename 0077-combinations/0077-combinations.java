class Solution {
    public void solve(int start, int n, int k, List<Integer> temp, List<List<Integer>> result){
        // Base case :-
        if(k == 0){
            result.add(new ArrayList<>(temp));
            return;
        }

        if(start > n) return;

        // Pick 'start' :-
        temp.add(start); // Add the start.
        solve(start + 1, n, k - 1, temp, result); 
        temp.remove(temp.size() - 1); // Backtrack

        solve(start + 1, n, k, temp, result); // Skip 'start'
    }

    public List<List<Integer>> combine(int n, int k) {
        /*
            Time complexity = O(n * (2 ^ n)), 
            Space complexity = O(n) -> For returning the resultant ArrayList.
        */
        
        List<List<Integer>> answer = new ArrayList<>();
        solve(1, n, k, new ArrayList<>(), answer);
        return answer;
    }
}