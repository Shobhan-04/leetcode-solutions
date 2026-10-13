class Solution {
    public int maxNumberOfBalloons(String text) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1) -> Constant sized map.
        */
        
        int n = text.length();
        HashMap<Character, Integer> charMap = new HashMap<>();
        int maxNoOfBalloons = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){ // O(n)
            char textCh = text.charAt(i);
            if(textCh == 'b' || textCh == 'a' || textCh == 'l' || textCh == 'o' || textCh == 'n'){
                charMap.put(textCh, charMap.getOrDefault(textCh, 0) + 1);
            }
        } 

        int balloonsCount1 = Math.min(charMap.getOrDefault('b', 0), Math.min(charMap.getOrDefault('a', 0), charMap.getOrDefault('n', 0)));
        int balloonsCount2 = Math.min(charMap.getOrDefault('l', 0), charMap.getOrDefault('o', 0));

        maxNoOfBalloons = Math.min(balloonsCount2 / 2, balloonsCount1);

        return maxNoOfBalloons;
    }
}