class Solution {
    public String[] createGrid(int m, int n) {
        /*
            Time complexity = O(m * n), 
            Space complexity = O(n) -> Auxilliary space for the character array.
        */
        
        String[] grid = new String[m];

        for(int i = 0; i < m; i++){ // O(m)
            char[] rowCh = new char[n];

            for(int j = 0; j < n; j++){ // O(n)
                // 0 to (n-1) :-
                if(i == 0 || j == (n - 1)) rowCh[j] = '.';

                // 0 to (m-1) :-
                else rowCh[j] = '#';
            }

            grid[i] = new String(rowCh);
        }

        return grid;
    }
}