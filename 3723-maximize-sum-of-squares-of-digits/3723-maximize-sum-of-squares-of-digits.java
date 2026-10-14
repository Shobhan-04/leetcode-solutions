class Solution {
    public String maxSumOfSquares(int num, int sum) {
        /*
            Time complexity = O(1),
            Space complexity = O(n) 
        */
        
        if(sum > num * 9) return "";

        int nines = (sum / 9); 
        int rem = (sum % 9);

        StringBuilder result = new StringBuilder();

        int i = 0;

        while(i < nines){
            result.append('9');
            i++;
        }

        if(rem > 0){
            result.append(rem);
        } 

        int m = result.length();

        while(m < num){
            result.append('0');
            m++;
        }

        return result.toString();
    }
}