class Solution {
    public int countPoints(String rings) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */

        int n = rings.length();
        int i = 0;
        int numberOfRods = 0;
        HashMap<Character, HashSet<Character>> colorMap = new HashMap<>();

        while(i < n){
            // Extract the color and rod number :-
            char color = rings.charAt(i);
            char rodNumber = rings.charAt(i + 1);

            // Check whether the rod number already exists in your HashMap.
            if(!colorMap.containsKey(rodNumber)){
               
                // If it exists, initialize a new HashSet if it doesn't exists.
                colorMap.putIfAbsent(rodNumber, new HashSet<>());
            }
            // If it doesn't exist, initialize a new color collection for that rod (if it already exists in the map or not).
            colorMap.get(rodNumber).add(color);

            i += 2;
        }

        for(HashSet<Character> color : colorMap.values()){
            if(color.contains('R') && color.contains('G') && color.contains('B')) 
            {
                numberOfRods++;
            }
        }

        return numberOfRods;
    }
}