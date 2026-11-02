class Solution {
    public int getMaximumConsecutive(int[] coins) {
        /*
            Time complexity = O(n log(n)) + O(n) = O(n log(n)), 
            Space complexity = O(1) 
        */
        
        int n = coins.length;
        int result = 1, i = 0;

        Arrays.sort(coins); // sort the given coins.

        while(i < n){ // O(n)
            int coin = coins[i];

            // if current coin value is greater than the result then,
            if(coin > result) break;
            result += coin; // add the coin into the result.

            i++;
        }

        return result;
    }
}