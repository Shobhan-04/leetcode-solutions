class Solution {
    public int minMoves(int[] nums) {
        /*
            sum + (n-1) * m = x * n - (i)
            minVal + m = x -(ii)
            => sum + (n-1) * m = (minVal + m) * n
            => sum + (n-1) * m = (minVal * n + m * n)
            => sum + (n * m - m) = (minVal * n + m * n)
            => sum - (minVal * n + m) = (m * n - n * m)
            => m = sum - (minVal * n)

            Time Complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = nums.length;
        int sum = 0, minVal = Integer.MAX_VALUE, m = 0;

        for(int i = 0; i < n; i++){
            int num = nums[i];
            sum += num;
            minVal = Math.min(minVal, num);
        }

        m = (sum - (minVal * n));
        return(m);
    }
}