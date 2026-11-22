class Solution {
    public boolean checkOnesSegment(String s) {
        /*
            Time complexity = O(1), 
            Space complexity = O(1)
        */
        
        if(s.contains("01")) return false;
        return true;
    }
}