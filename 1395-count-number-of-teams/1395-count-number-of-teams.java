class Solution {
    public int numTeams(int[] rating) {
        /*
            Time complexity = O(n^3), 
            Space complexity = O(1)
        */
        
        int n = rating.length;
        
        int i = 0;
        int noOfTeams = 0;

        while(i < (n - 2)){
            int j = (i + 1);

            while(j < (n - 1)){
                int k = (j + 1);

                while(k < n){
                    if((rating[i] < rating[j] && rating[j] < rating[k]) || (rating[i] > rating[j] && rating[j] > rating[k]))
                    {
                        noOfTeams++;
                    }

                    k++;
                }

                j++;
            }

            i++;
        }

        return noOfTeams;
    }
}