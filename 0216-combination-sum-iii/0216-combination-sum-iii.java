class Solution {
    public void solve(int start, int target, int k, List<Integer> temp, List<List<Integer>> result)
    {
        if(k == 0 && target == 0){
            result.add(new ArrayList<>(temp));
            return;
        }

        if(start > 9 || k < 0 || target < 0) return;

        // Pick the 'start' :-
        temp.add(start); // Add the 'start'
        solve(start + 1, target - start, k - 1, temp, result); // Explore by subtracting 'start' from 'target'
        temp.remove(temp.size() - 1); // Backtrack

        solve(start + 1, target, k, temp, result); // Skip the 'start'
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        /*
            Time complexity = O(n * (2 ^ n)), 
            Space comlexity = O(n) -> For returning the ArrayList.
        */
        
        List<List<Integer>> result = new ArrayList<>();
        solve(1, n, k, new ArrayList<>(), result);
        return result;
    }
}