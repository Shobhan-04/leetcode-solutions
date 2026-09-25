class Solution {
    public char[] reverse(String num){
        int n = num.length();
        char[] ans = num.toCharArray();
        int left = 0, right = (n-1);

        while(left < right){
            char temp = ans[left];
            ans[left] = ans[right];
            ans[right] = temp;

            left++;
            right--;
        }

        return ans;
    }

    public String multiply(String num1, String num2) {
        char[] s1 = reverse(num1);
        char[] s2 = reverse(num2);
        int m = s1.length, n = s2.length;

        int[] result = new int[m + n];

        for(int i = 0; i < m; i++){
            int carry = 0, start = i;

            for(int j = 0; j < n; j++){
                int n1 = s1[i] - '0';
                int n2 = s2[j] - '0';
                int sum = (n1 * n2) + result[start] + carry;
                int base = sum % 10;
                carry = (sum / 10);
                result[start++] = base; 
            }

            if(carry != 0) result[start] = carry;
        }
        
        int i = result.length - 1;

        while(i > 0 && result[i] == 0) i--;

        String ans = "";

        while(i >= 0){
            ans += result[i];
            i--;
        }

        return ans;
    }
}