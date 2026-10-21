class Solution {
    public void findCombinations(int[] candidates, int target, int idx, List<Integer> currLst, List<List<Integer>> resultLst){
        int n = candidates.length;

        int i = idx;

        if(target == 0){
            resultLst.add(new ArrayList<>(currLst));
            return;
        }

        while(i < n){
            int candidate = candidates[i];

            if(i > idx && candidate == candidates[i-1]){
                i++;
                continue;
            }

            if(candidate > target){
                break;
            }

            currLst.add(candidate); // Do
            
            // Explore :-
            findCombinations(candidates, target - candidate, i + 1, currLst, resultLst);
            
            int m = currLst.size();
            currLst.remove(m - 1); // Undo

            i++;
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        /*
            Backtracking Approach :-

                Time complexity = O(2^n) + O(T(n)) + O(n log(n)), 
                Space complexity = O(n)
        */
        
        int n = candidates.length;
        List<List<Integer>> resultLst = new ArrayList<>();
        List<Integer> currLst = new ArrayList<>();

        Arrays.sort(candidates); // O(n log(n))

        findCombinations(candidates, target, 0, currLst, resultLst);

        return resultLst;
    }
}