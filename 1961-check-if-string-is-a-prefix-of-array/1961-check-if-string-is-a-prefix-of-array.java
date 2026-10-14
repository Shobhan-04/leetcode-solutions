class Solution {
    public boolean isPrefixString(String s, String[] words) {
        /*
            Time complexity = O(m^2) -> Due to the repeated string concatenation 
            Space complexity = O(m)  
        */
        
        int m = s.length(), n = words.length;

        String tempStr = words[0];
        int k = tempStr.length();

        int i = 1;

        // Base condition :-
        if(n == 0) return(s.isEmpty());

        while(k < m && i < n){
            String word = words[i];
            tempStr += word;
            k = tempStr.length();

            i++;
        }

        if(tempStr.equals(s)) return true;

        return false;
    }
}