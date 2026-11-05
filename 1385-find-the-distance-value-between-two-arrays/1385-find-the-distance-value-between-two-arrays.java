class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        /*
            Time complexity = O(m x n), 
            Space complexity = O(1)
        */
        
        int m = arr1.length, n = arr2.length;
        int distanceCount = 0;

        for(int i = 0; i < m; i++){ // O(m)
            boolean allValid = true; 

            for(int j = 0; j < n; j++){ // (n)
                int condition = (int) Math.abs(arr1[i] - arr2[j]);
                
                if(condition <= d){
                    allValid = false;
                    break;
                }
            }

            if(allValid == true) distanceCount++;
        }

        return distanceCount;
    }
}