class Solution {
    public int distributeCandies(int[] candyType) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for HashSet.
        */
        
        int n = candyType.length;

        int i = 0, candiesCount = 0;

        HashSet<Integer> set = new HashSet<>();

        while(i < n){ // O(n)
            int candy = candyType[i];
            set.add(candy);

            i++;
        }

        int m = set.size();
        candiesCount = Math.min(m, (n / 2));

        return(candiesCount);
    }
}