class Solution {
    public boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
        {
            return true;
        }

        return false;
    }

    public boolean halvesAreAlike(String s) {
        /*
            Time complexity = O(n / 2 + n / 2) = O(n), 
            Space complexity = O(1)
        */
        
        int n = s.length();
        int aCount = 0, bCount = 0;
        
        int left = 0, right = (n / 2);

        while(left < n / 2 && right < n){
            char leftCh = s.charAt(left);
            char rightCh = s.charAt(right);

            if(isVowel(leftCh)) aCount++;
            if(isVowel(rightCh)) bCount++;

            left++;
            right++;
        }
        
        if(aCount == bCount) return true;
        
        return false;
    }
}