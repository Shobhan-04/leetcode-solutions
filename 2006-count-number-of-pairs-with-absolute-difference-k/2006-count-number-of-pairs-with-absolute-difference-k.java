class Solution {
    public int countKDifference(int[] nums, int k) {
        /*
            Time complexity = O(n + 100) = O(n), 
            Space complexity = O(1) 
        */
        
        int i = 0, n = nums.length;
        int noOfPairsCount = 0;
        int[] freq = new int[101]; // size from 1-100

        // Store the array elements into the frequency array :-
        while(i < n){ // O(n)
            int num = nums[i];
            freq[num]++;
            i++;
        }

        i = 0;

        while(i < (101 - k)){ // O(100)
            noOfPairsCount += (freq[i] * freq[i + k]);
            i++;
        }

        return(noOfPairsCount);
    }
}