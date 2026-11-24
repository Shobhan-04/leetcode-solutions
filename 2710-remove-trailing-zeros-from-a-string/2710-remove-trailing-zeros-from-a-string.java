class Solution {
    public String removeTrailingZeros(String num) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = num.length(), i = (n - 1);

        while(i >= 0){
            char numCh = num.charAt(i);
            if(numCh != '0') break;

            i--;
        }

        return(num.substring(0, i + 1));
    }
}