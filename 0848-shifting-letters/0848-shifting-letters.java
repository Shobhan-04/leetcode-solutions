class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        /*
            Time complexity = O(n^2), 
            Space complexity = O(n)
        */
        
        int m = s.length(), n = shifts.length;
        int normalizedShift = 0;

        StringBuilder finalString = new StringBuilder();
        
        for(int i = n-1; i >= 0; i--){ // O(n)
            int shift = shifts[i];
            normalizedShift = (normalizedShift + shift % 26) % 26;
            char sCh = s.charAt(i);
            char shiftedChars = (char) ((sCh - 'a' + normalizedShift) % 26 + 'a');
            finalString.insert(0, shiftedChars);
        }

        return finalString.toString();
    }
}