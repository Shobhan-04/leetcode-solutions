class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        /*
            Brute force approach :-
                Time complexity = O(n^2), 
                Space complexity = O(1)
        */
        
        int n = s.length();

        int i = 0, result = Integer.MIN_VALUE;

        while(i <= (n-2)){
            int j = (i + 1);

            while(j < n){
                if(s.charAt(i) == s.charAt(j)) result = Math.max(result, (j- i - 1));
                j++;
            }

            i++;
        }

        return result == Integer.MIN_VALUE ? -1 : result;
    }
}