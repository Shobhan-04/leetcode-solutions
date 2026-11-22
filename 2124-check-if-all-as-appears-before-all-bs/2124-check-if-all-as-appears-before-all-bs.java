class Solution {
    public boolean checkString(String s) {
        /*
            Time complexity = O(1), 
            Space complexity = O(1)
        */
        
        String bAfterA = "ba";

        if(s.contains(bAfterA)) return false;
        return true;
    }
}