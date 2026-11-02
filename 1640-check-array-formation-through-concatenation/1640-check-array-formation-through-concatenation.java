class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        /*
            Intuition :-
            The order of the arrays inside pieces can change, but the order of elements within each individual piece must remain unchanged.

            Time complexity = O(m x n + arrLength), 
            Space complexity = O(n) -> Auxilliary space for the HashMap.
        */
        
        int arrLength = arr.length;
        int m = pieces.length; // pieces present in the row.

        // Create a elemenet ot index mapping :-
        HashMap<Integer, Integer> elemToIndexMap = new HashMap<>();

        for(int i = 0; i < arrLength; i++){ // O(arrLength)
            int arrElem = arr[i];
            elemToIndexMap.put(arrElem, i); // every element is mapped to its corresponding index.
        }

        boolean isPiecesFormsArray = true;

        for(int i = 0; i < m; i++){ // O(m)
            int n = pieces[i].length; // calculate the length of the each piece.

            for(int j = 0; j < n; j++){ // O(n)
                int piece = pieces[i][j]; // get each of the piece. 
                
                // get the starting index of rach piece :-
                int startIndex = elemToIndexMap.getOrDefault(pieces[i][0], -1);

                // Base condition :-
                if(startIndex == -1) return false;

                if((startIndex + j >= arrLength) || (arr[startIndex + j] != pieces[i][j]))
                {
                    isPiecesFormsArray = false;
                }
            }
        }

        return isPiecesFormsArray == true ? true : false; // Return true if it is possible to form the array arr from pieces. 
    }
}