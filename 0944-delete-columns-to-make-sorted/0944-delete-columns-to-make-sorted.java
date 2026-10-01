class Solution {
    public int minDeletionSize(String[] strs) {
        /*
            Time complexity = O(n + m), 
            Space complexity = O(1)
        */
        
        int m = strs.length;
        int n = strs[0].length(); // first word in strs.
        int row = 1, col = 0; 
        int deleteColumnsCount = 0;

        while(col < n){
            row = 1; // Start from second row for every column
            while(row < m){
                if(strs[row].charAt(col) < strs[row-1].charAt(col)){
                    deleteColumnsCount++;
                    break;
                }

                row++;
            }

            col++;
        }

        return deleteColumnsCount;
    }
}