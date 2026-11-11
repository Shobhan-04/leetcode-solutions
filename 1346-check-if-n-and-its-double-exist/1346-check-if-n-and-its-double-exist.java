class Solution {
    public boolean checkIfExist(int[] arr) {
        /*
            Time complexity = O(n^2), 
            Space complexity = O(1)
        */
        
        int n = arr.length;

        for(int i = 0; i < n; i++){ // O(n)
            for(int j = 0; j < n; j++){ // O(n)
                if(i != j && (arr[i] == 2 * arr[j])){
                    return true;
                }
            }
        }

        return false;
    }
}