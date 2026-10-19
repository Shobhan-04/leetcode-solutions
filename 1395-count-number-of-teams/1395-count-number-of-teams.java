class Solution {
    public int numTeams(int[] rating) {
        /*
            Time complexity = O(n^2), 
            Space complexity = O(1)
        */
        
        int n = rating.length;
        
        int noOfTeams = 0;

        for(int i = 0; i < n; i++){
            int leftSmaller = 0, leftGreater = 0;
            int rightGreater = 0, rightSmaller = 0;

            for(int j = 0; j < i; j++){
                if(rating[j] < rating[i]) leftSmaller++;
                else if(rating[j] > rating[i]) leftGreater++;
            }

            for(int k = (i + 1); k < n; k++){
                if(rating[k] < rating[i]) rightSmaller++;
                else if(rating[k] > rating[i]) rightGreater++;
            }

            noOfTeams += (leftSmaller * rightGreater + leftGreater * rightSmaller);
        }

        return noOfTeams;
    }
}