class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        /*
            Brute force approach :-
                Time complexity = O(n), 
                Space complexity = O(26) = O(1)
        */
        
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        int result = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            char sCh = s.charAt(i);
            if(!map.containsKey(sCh)) map.put(sCh, i);
            else result = Math.max(result, i - map.get(sCh) - 1);
        }        

        return result == Integer.MIN_VALUE ? -1 : result;
    }
}