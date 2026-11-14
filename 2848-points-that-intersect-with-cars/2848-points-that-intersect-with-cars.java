class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        /*
            Better approach :-
                Time complexity = O(n * m), where n is the number of intervals and m is the average length of an interval.

                Space complexity = O(1) 
        */
        
        int n = nums.size();
        int[] points = new int[101];
        int intersectingPointsCount = 0;

        int start = 0, end = 0;

        for(List<Integer> lst : nums){ // O(n)
            start = lst.get(0);
            end = lst.get(1);

            for(int num = start; num <= end; num++){ // O(m)
                points[num]++;
            }
        }

        int m = points.length;
        for(int i = 0; i < m; i++){
            int point = points[i];

            if(point != 0) intersectingPointsCount++;
        }

        return(intersectingPointsCount);
    }
}