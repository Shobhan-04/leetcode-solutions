class Solution {
    public String toHex(int num) {
        String hex = "0123456789abcdef"; // hexadecimal nos. from 0-16.
        StringBuilder result = new StringBuilder();
        String answer = "";

        // Base condition :-
        if(num == 0) return("0");

        while(num != 0){
            /*
                '_' represents -> to the base :-

                num = 26 -> bin(26) = (00011010)_2
                (num & 15) => (00011010)_2 & (00001111)_2 = (00001010)_2 = (10)_10
            */
            int rem = (num & 15); // rem stores the extracted last 4 digits of the num.
            char remCh = hex.charAt(rem); // stores each character of hex.
            result.append(remCh); // append character stored in remCh into result.

            // Two's complement method :-
            num >>>= 4; // unsigned right shift by 4, means shifting the 32-bit representation to the right while filling with 0's in the 1st 4 bits.
        }

        answer = result.reverse().toString(); // Reverse the StringBuilder and then, convert it into the string.
        return(answer); // Return the resultant string as the answer.
    }
}