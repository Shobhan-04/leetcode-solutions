class Solution {
    public int minimumDeletions(String s) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for the left_a and right_b arrays respectively.
        */
        
        int n = s.length();

        int[] left_b = new int[n];
        int[] right_a = new int[n];

        int count_b = 0, count_a = 0;

        for(int i = (n - 1); i >= 0; i--){ // O(n)
            right_a[i] = count_a;

            char sCh = s.charAt(i);
            if(sCh == 'a') count_a++;
        }

        for(int i = 0; i < n; i++){ // O(n)
            left_b[i] = count_b;
            
            char sCh = s.charAt(i);
            if(sCh == 'b') count_b++;
        }

        int minDeletions = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            minDeletions = Math.min(minDeletions, left_b[i] + right_a[i]);
        }

        return minDeletions;
    }
}