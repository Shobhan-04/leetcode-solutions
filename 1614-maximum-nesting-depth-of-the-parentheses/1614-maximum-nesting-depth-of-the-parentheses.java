class Solution {
    public int maxDepth(String s) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = s.length(), openBracketsCount = 0, nestingDepth = 0;

        for(int i = 0; i < n; i++){ // O(n)
            char sCh = s.charAt(i);

            if(sCh == '(') openBracketsCount++;
            else if(sCh == ')') openBracketsCount--;

            nestingDepth = Math.max(nestingDepth, openBracketsCount);
        }

        return nestingDepth;
    }
}