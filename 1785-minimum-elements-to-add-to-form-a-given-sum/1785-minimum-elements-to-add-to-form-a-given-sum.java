class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = nums.length;
        int minElementsCount = 0;

        int i = 0;

        long sumNums = 0;

        // Calculate the sum of each and every element :-
        while(i < n){
            int num = nums[i];
            
            if(num <= limit){
                sumNums += num;
            }

            i++;
        }

        // Find the difference from the goal :-
        long difference = Math.abs((long) goal - sumNums);

        //Calculate the non-difference and positive formula using integer ceil-division :-
        minElementsCount = (int) Math.ceil((difference + limit - 1) / limit);

        return minElementsCount; // Return the minimum number of elements you need to add to make the sum of the array equal to goal. 
    }
}