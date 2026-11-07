class Solution {
    public String kthDistinct(String[] arr, int k) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for the HashMap. 
        */
        
        int n = arr.length;
        HashMap<String, Integer> countMap = new HashMap<>();

        // Calculating the frequency of the strings present in the array using a HashMap :
        for(int i = 0; i < n; i++){ // O(n)
            String arrElem = arr[i];
            countMap.put(arrElem, countMap.getOrDefault(arrElem, 0) + 1);
        }

        String kThDistinctString = "";
        int distinctCount = 0;

        for(int i = 0; i < n; i++){ // O(n)
            String arrElem = arr[i];

            if(countMap.get(arrElem) == 1){
                distinctCount++;
                if(distinctCount == k) return kThDistinctString = arrElem;
            } 
        }

        return(kThDistinctString == "" ? "" : kThDistinctString);
    }
}