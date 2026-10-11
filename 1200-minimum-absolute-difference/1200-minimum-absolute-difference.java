class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        /*
            Time complexity = O(n log(n)), 
            Space complexity = O(1)
        */
        
        int n = arr.length;
        int minDiff = Integer.MAX_VALUE;

        Arrays.sort(arr); // O(n log(n))

        int i = 1, j = 1;

        while(i < n){
            int diff = Math.abs(arr[i] - arr[i-1]);
            minDiff = Math.min(minDiff, diff);
            
            i++;
        }

        List<List<Integer>> result = new ArrayList<>();

        while(j < n){
            int diff = Math.abs(arr[j] - arr[j-1]);

            if(diff == minDiff){
                result.add(Arrays.asList(arr[j-1], arr[j]));
            }

            j++;
        }

        return result;
    }
}