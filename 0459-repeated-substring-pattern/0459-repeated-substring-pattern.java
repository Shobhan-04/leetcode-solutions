class Solution {
    public boolean repeatedSubstringPattern(String s) {
        /*
            Time complexity = O(n root(n))
            Space complexity = O(1)
        */
        
        int n = s.length();
        int len = n / 2;

        while(len >= 1){ // O(n/2) = O(root(n))
            if(n % len == 0){
                int times = (n / len);
                String pattern = s.substring(0, len);
                String newString = "";

                int j = 0;

                while(j < times){ // O(n)
                    newString += pattern;
                    j++;
                }

                if(newString.equals(s)) return true;
            }

            len--;
        }

        return false;
    }
}