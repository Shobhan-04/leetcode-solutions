class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        /*
            Time complexity = O(n^2), 
            Space complexity = O(1)
        */
        
        int n = nums.size();
        
        int minPosSumSubarray = Integer.MAX_VALUE;
        int i = 0;

        while(i < n){ // O(n)
            int j = i;
            int currentWindowSum = 0;

            while(j < n){ // O(n)
                int range = (j - i + 1);
                currentWindowSum += nums.get(j);

                if(range >= l && range <= r && currentWindowSum > 0){
                    minPosSumSubarray = Math.min(minPosSumSubarray, currentWindowSum);
                }

                j++;
            }

            i++;
        }
        
        return(minPosSumSubarray == Integer.MAX_VALUE ? -1 : minPosSumSubarray);
    }
}