class Solution {
    public int binarySearch(int[] nums, int target){
        /*
            Time complexity = O(log(n)), 
            Space complexity = O(1)
        */
        
        int n = nums.length;
        int left = 0, right = (n - 1);

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target) return(mid + 1);
            else if(nums[mid] < target) left = (mid + 1);
            else right = (mid - 1);
        }

        return(left);
    }

    public int[] answerQueries(int[] nums, int[] queries) {
        /*
            Time complexity = O(m log(n)) + O(n log(n)) + O(n) = O((n + m) log(n)), 
            Space complexity = O(n + m) -> Auxilliary space for the prefixSumArr and the answer array.
        */
        
        int n = nums.length, m = queries.length;
        
        int[] prefixSumArr = new int[n];
        Arrays.sort(nums); // O(n log(n))

        prefixSumArr[0] = nums[0]; // Initialize the prefixSumArr[0] element same as the nums[0] element.
        
        // Iterate over the length of nums, to calculate the prefixSumArr :-
        for(int i = 1; i < n; i++){ // O(n)
            int num = nums[i];
            prefixSumArr[i] = (nums[i] + prefixSumArr[i - 1]);
        }

        int[] answer = new int[m];

        for(int i = 0; i < m; i++){ // O(m log(n))
            int query = queries[i];
            int subsequenceIdx = binarySearch(prefixSumArr, query);
            answer[i] = subsequenceIdx; 
        }

        return(answer);
    }
}