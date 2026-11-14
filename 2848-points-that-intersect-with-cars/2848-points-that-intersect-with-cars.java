class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        /*
            Brute Force approach :-
                Time complexity = O(n * m), where n is the number of intervals and m is the average length of an interval.

                Space complexity = O(n) -> Auxilliay space for storing the intersecting points in the HashSet.
        */
        
        int n = nums.size();
        HashSet<Integer> set = new HashSet<>();
        int intersectingPoints = 0;

        int start = 0, end = 0;

        for(List<Integer> lst : nums){ // O(n)
            start = lst.get(0);
            end = lst.get(1);

            for(int i = start; i <= end; i++){ // O(m)
                if(!set.contains(i)) set.add(i);
            }
        }

        return(set.size());
    }
}