class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        /*
            Time complexity = O(m * n), 
            Space complexity = O(1)
        */
        
        int m = arr1.length, n = arr2.length;

        int i = 0;
        int distanceCount = 0;

        while(i < m){ // O(m)
            int curr1 = arr1[i];
            int j = 0;
            boolean validDistance = true;
            
            while(j < n){ // O(n)
                int curr2 = arr2[j];
                int currD = Math.abs(curr1 - curr2);

                if(currD <= d){
                    validDistance = false;
                    break;
                }

                j++;
            }

            if(validDistance == true) distanceCount++;

            i++;
        }

        return distanceCount;
    }
}