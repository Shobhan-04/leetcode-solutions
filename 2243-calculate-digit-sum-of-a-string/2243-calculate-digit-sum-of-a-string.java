class Solution {
    public String digitSum(String s, int k) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space by StringBuilder and s of length n
        */
        
        int n = s.length();
        int i = 0;
        StringBuilder sb = new StringBuilder();

        while(n > k){
            i = 0; // reset
            sb.setLength(0); // reset

            while(i < n){
                int j = i;
                int sumOfDigits = 0;

                while(j < (i + k) && j < n){
                    char sCh = s.charAt(j);

                    int digit = Integer.parseInt(String.valueOf(sCh)); // char-> str-> int
                    sumOfDigits += digit;

                    j += 1;
                }
                
                sb.append(sumOfDigits);

                i += k;
            }
            
            s = sb.toString();
            n = s.length();
        }

        return s;
    }
}