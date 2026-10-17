class Solution {
    public boolean isValid(int[] nums, int mid, int p){
        int n = nums.length, i = 0;
        int minDiff = Integer.MAX_VALUE, pairsCount = 0;

        while(i < n-1){
            minDiff = (nums[i + 1] - nums[i]);

            if(minDiff <= mid){
                pairsCount++;
                i += 2;
            }else{
                i++;
            }
        }

        return(pairsCount >= p ? true : false);
    }

    public int minimizeMax(int[] nums, int p) {
        /*
            Mini-max problem types :-
                Time complexity = O(n log(m)),
                Space complexity = O(1)
        */
        
        int n = nums.length;
        
        int minMaxDiff = Integer.MAX_VALUE;

        Arrays.sort(nums); // Sort the array.

        int left = 0, right = (nums[n-1] - nums[0]); // (r - l) = m 

        while(left <= right){ // O(log (m))
            int mid = left + (right - left) / 2;

            if(isValid(nums, mid, p)){ // O(n)
                minMaxDiff = mid;
                right = (mid - 1);
            }else{
                left = (mid + 1);
            }
        }

        return minMaxDiff;
    }
}