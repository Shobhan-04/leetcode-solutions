class Solution {
    public String addStrings(String num1, String num2) {
        /*
            Time complexity = O(m + n), 
            Space complexity = O(n)
        */

        int m = num1.length(), n = num2.length();
        
        StringBuilder result = new StringBuilder();

        int i = (m-1), j = (n-1), carry = 0;

        while(i >= 0 || j >= 0 || carry > 0){
            int digit1 = 0, digit2 = 0;

            if(i >= 0){
                char num1Ch = num1.charAt(i);
                digit1 = num1Ch - '0';
                i--;
            }

            if(j >= 0){
                char num2Ch = num2.charAt(j);
                digit2 = num2Ch - '0';
                j--;
            }

            // Calculate the sum of the previous digits and carry :-
            int sum = (digit1 + digit2 + carry);

            carry = (sum / 10); // Determine the new carry.

            int lastDigit = (sum % 10);

            result.append(lastDigit);
        }

        return result.reverse().toString();
    }
}