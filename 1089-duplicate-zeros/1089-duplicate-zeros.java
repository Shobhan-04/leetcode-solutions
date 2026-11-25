class Solution {
    public void duplicateZeros(int[] arr) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = arr.length;
        int zerosCount = 0;

        for(int elem : arr){
            if(elem == 0) zerosCount++;
        }

        int j = (n - 1) + zerosCount;

        for(int i = (n - 1); i >= 0; i--){
            if(j < n) arr[j] = arr[i];
            j--;

            if(arr[i] == 0){
                if(j < n) arr[j] = 0;
                j--;
            }
        }
    }
}