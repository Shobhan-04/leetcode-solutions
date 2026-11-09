class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        /*
            Time complexity = O(1), 
            Space complexity = O(n) -> Auxilliary space for the resultant list.
        */
        
        List<String> result = new ArrayList<>();

        for(int hh = 0; hh <= 11; hh++){
            for(int mm = 0; mm <= 59; mm++){
                if(Integer.bitCount(hh) + Integer.bitCount(mm) == turnedOn){
                    result.add(String.format("%d:%02d", hh, mm));
                }
            }
        }

        return result;
    }
}