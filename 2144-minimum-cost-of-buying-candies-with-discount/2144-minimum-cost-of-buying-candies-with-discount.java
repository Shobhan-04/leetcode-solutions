class Solution {
    public int minimumCost(int[] cost) {
        /*
            Time complexity = O(n log(n)), 
            Space complexity = O(1)
        */
        
        int n = cost.length;
        int i = 0, j = 0;
        int minimumCost = 0;

        Arrays.sort(cost); // O(n log(n))

        int mid = (n / 2);

        while(j < mid){ // Reverse the array in-place.
            int temp = cost[j];
            cost[j] = cost[n-j-1];
            cost[n-j-1] = temp;

            j++;
        }

        while(i < n){
            int eachCandyCost = cost[i];
            
            if(i % 3 != 2){ // for i = 2, 5, 8, 11, 14, 17, 20, 23...
                // Add only those element which when, that particular element is divided by 3 doesn't leaves the remainder as 2.
                minimumCost += eachCandyCost;
            }

            i++;
        }

        return minimumCost;
    }
}