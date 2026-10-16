class Solution {
    public int countDistinctElements(int[] nums, int low, int high){
        boolean[] visited = new boolean[100];
        Arrays.fill(visited, false);

        int count = 0;

        for(int i = low; i <= high; i++){
            int num = nums[i];

            if(!visited[num]){
                visited[num] = true;
                count++;
            }
        }

        return count;
    }

    public int[] distinctDifferenceArray(int[] nums) {
        /*
            Eg. 1 :-
            nums = {1,2,3,4,5}
            distinct difference = (countPrefix - countSuffix)
                => For (i = 0) -> (0, 0), (1, 4) => (1 - 4) = -3
                => For (i = 1) -> (0, 1), (2, 4) => (2 - 3) = -1
                => For (i = 2) -> (0, 2), (3, 4) => (3 - 2) = 1
                => For (i = 3) -> (0, 3), (4, 4) => (4 - 1) = 3
                => For (i = 4) -> (0, 4), (1, 4) => (5 - 0) = 5
            
            Eg. 2 :-
            nums = {1,2,2}
            distinct difference = (countPrefix - countSuffix) = (0, i) - (i+1, n-1)
                => For (i = 0) -> (0, 0), (1, 2) => (1 - 1) = 2
                => For (i = 1) -> (0, 1), (2, 2) => (2 - 1) = 1
                => For (i = 2) -> (0, 2), (3, 2) => (2 - 0) = 2
            
            Time complexity = O(n), 
            Space complexity = O(1) -> Considering that the resultant array doesn't takes any auxilliary space.
        */
        
        int n = nums.length;

        int i = 0;

        int[] distinctDiff = new int[n];

        while(i < n){ // O(n)
            int countPrefix = countDistinctElements(nums, 0, i);
            int countSuffix = countDistinctElements(nums, i+1, n-1);
            distinctDiff[i] = (countPrefix - countSuffix);

            i++; 
        }

        return distinctDiff;
    }
}