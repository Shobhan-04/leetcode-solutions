class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zerosCount = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] == 0) zerosCount++;
        }

        for(int k = (n - 1), j = (n - 1) + zerosCount; k != j; k--){
            if(j < n) arr[j] = arr[k];
            j--;

            if(arr[k] == 0){
                if(j < n){
                    arr[j] = arr[k];
                }

                j--;
            }
        }
    }
}