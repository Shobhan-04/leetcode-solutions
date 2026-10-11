class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = arr.length;
        int i = 0;

        while(i <= (n -3)){
            int curr = arr[i], currNext1 = arr[i+1], currNext2 = arr[i+2];

            if(curr % 2 != 0 && currNext1 % 2 != 0 && currNext2 % 2 != 0) return true;
            i++;
        }

        return false;
    }
}