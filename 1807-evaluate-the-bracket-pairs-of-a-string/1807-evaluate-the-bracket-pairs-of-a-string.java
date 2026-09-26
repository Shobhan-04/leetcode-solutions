class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        /*
            Time complexity = O(m + n), 
            Space complexity = O(n) -> Auxilliary space for map, result and tempStr.
        */
        
        int n = s.length(), m = knowledge.size();

        HashMap<String, String> map = new HashMap<>();

        for(int i = 0; i < m; i++){ // {"name": "Bob", "age": "Two"}
            String key = knowledge.get(i).get(0); // "name" and "age"
            String value = knowledge.get(i).get(1); // "Bob" and "Two"

            map.put(key, value); // Store the <K, V> into the map.
        }

        StringBuilder result = new StringBuilder(); // O(n)
        StringBuilder tempStr = new StringBuilder(); // O(n)
        boolean isBracketOpened = false; // flag variable.

        for(int i = 0; i < n; i++){ // O(n)
            char sCh = s.charAt(i); // extract each character from s.

            if(sCh == '('){ // check bracket is opened or not,
                isBracketOpened = true; // then, set flag variable to true.
            }else if(sCh == ')'){ // check bracket is closed or not,
                isBracketOpened = false; // then, set flag variable to false.
                String key_i = tempStr.toString(); // Convert the StringBuilder -> String.
                String value_i = map.get(key_i);

                // If map contains the key then, replace key_i and the bracket pair with the key's corresponding value_i.
                if(map.containsKey(key_i)) result.append(value_i);

                else result.append("?"); // If we do not know the value of the key, you will replace keyi and the bracket pair with a question mark "?" (without the quotation marks).

                tempStr.setLength(0); // After finding name, we need to reset tempStr before processing the next key.
            }else if(isBracketOpened == true){
                tempStr.append(sCh);
            }else{ // isBracketOpened == false
                result.append(sCh);
            }
        }

        return result.toString(); // Return the resulting string after evaluating all of the bracket pairs.
    }
}