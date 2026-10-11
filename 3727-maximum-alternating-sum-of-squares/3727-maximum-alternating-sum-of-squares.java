class Solution {
    public long maxAlternatingSum(int[] nums) {
        /*
            Time complexity = O(n log(n)) -> For sorting using the Comparator's compare() method,
            Space complexity = O(n) -> Auxilliary space for arr.
        */

        int n = nums.length;

        Integer[] arr = new Integer[n];

        int i = 0;

        while(i < n){
            arr[i] = nums[i];
            i++;
        }

        Arrays.sort(arr, (a, b) -> 
            Long.compare(Math.abs((long) a), Math.abs((long) b))
        );

        int left = 0, right = (n - 1);
        long score = 0;

        while(left <= right){
            long value = arr[right];
            score += (value * value);
            right--;

            if(left <= right){
                value = arr[left];
                score -= (value * value);
                left++;
            }
        }

        return score;
    }
}