class Solution {
    public int compareVersion(String version1, String version2) {
        /*
            Time complexity = O(max(m, n)), 
            Space complexity = O(n)
        */
        
        String[] version1Tokenized = version1.split("\\.");
        String[] version2Tokenized = version2.split("\\.");

        int m = version1Tokenized.length, n = version2Tokenized.length;
        int maxLength = Math.max(m, n);

        for(int i = 0; i < maxLength; i++){
            int num1 = 0, num2 = 0;

            if(i < m) num1 = Integer.parseInt(version1Tokenized[i]);
            if(i < n) num2 = Integer.parseInt(version2Tokenized[i]);

            if(num1 > num2) return 1;
            if(num1 < num2) return -1;
        }

        return 0;
    }
}