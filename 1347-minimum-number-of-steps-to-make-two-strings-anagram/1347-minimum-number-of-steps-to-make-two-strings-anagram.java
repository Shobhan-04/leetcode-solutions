class Solution {
    public int minSteps(String s, String t) {
        /*
            Time complexity = O(n) + O(26), 
            Space complexity = O(26) = O(1)
        */
        
        int m = s.length(), n = t.length();
        int[] sArr = new int[26];
        int[] tArr = new int[26];

        Arrays.fill(sArr, 0);
        Arrays.fill(tArr, 0);

        int minNoOfSteps = 0;

        for(int i = 0; i < n; i++){
            char sCh = s.charAt(i);
            char tCh = t.charAt(i);

            sArr[sCh - 'a']++;
            tArr[tCh - 'a']++;
        }

        for(int i = 0; i < 26; i++){ // O(26)
            if(sArr[i] > tArr[i]){
                int diff = (sArr[i] - tArr[i]);
                minNoOfSteps += diff;
            }
        }

        return minNoOfSteps;
    }
}