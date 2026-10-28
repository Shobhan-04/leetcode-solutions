class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        /*
            delta calculation logic :-
                sumAliceBoxes - x + y = sumBobBoxes - y + x
                => delta = y = (subBobBoxes - sumAliceBoxes + 2x) / 2

            Time complexity = O(n + 2m) = O(n + m), 
            Space complexity = O(n) -> Auxilliary space for aliceSet, bobSet.
        */
        
        int m = aliceSizes.length, n = bobSizes.length;
        int sumAliceBoxes = 0, sumBobBoxes = 0;

        HashSet<Integer> aliceSet = new HashSet<>();
        HashSet<Integer> bobSet = new HashSet<>(); 

        int[] result = new int[2];
        int aliceExchangedCandiesCount = 0, bobExchangedCandiesCount = 0;

        // Calculate the sum of all boxes belonging to Bob :-
        for(int i = 0; i < n; i++){ // O(n)
            int bobElems = bobSizes[i];
            sumBobBoxes += bobSizes[i];
            bobSet.add(bobElems); // Store Bob's box sizes in a HashSet for fast lookup.
        }
        
        // Calculate the sum of all boxes belonging to Alice :-
        for(int i = 0; i < m; i++){ // O(m)
            int aliceElems = aliceSizes[i];
            sumAliceBoxes += aliceElems;
        }

        // Calculate the difference between their totals and divide it by two.
        int delta = (sumBobBoxes - sumAliceBoxes) / 2;

        // Iterate through Alice's boxes. For each box, calculate the size Bob must give in exchange.
        for(int i = 0; i < m; i++){ // O(m)
            int aliceElems = aliceSizes[i];
            int bobsReqdBoxes = (aliceElems + delta);

            // If that required size exists in Bob's set, return the pair containing Alice's box size and Bob's required box size.
            if(bobSet.contains(bobsReqdBoxes)){
                aliceExchangedCandiesCount = aliceElems;
                bobExchangedCandiesCount = bobsReqdBoxes;

                result[0] = aliceExchangedCandiesCount;
                result[1] = bobExchangedCandiesCount;
            }
        }

        return result;
    }
}