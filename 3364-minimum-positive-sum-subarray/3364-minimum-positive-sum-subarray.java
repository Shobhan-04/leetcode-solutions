class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minSubArrSum = Integer.MAX_VALUE;

        for(int low = 0; low <= (n - l); low++){
            int currSubArrSum = 0;

            for(int high = 1; high <= r; high++){
                if(low + high - 1 >= n) break;

                currSubArrSum += nums.get(low + high - 1);  

                if(high >= l && currSubArrSum > 0){
                    minSubArrSum = Math.min(minSubArrSum, currSubArrSum);
                } 
            }
        }
        
        return minSubArrSum == Integer.MAX_VALUE ? -1 : minSubArrSum;
    }
}