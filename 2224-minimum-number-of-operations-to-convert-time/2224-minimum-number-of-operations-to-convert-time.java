class Solution {
    public int convertToMinutes(String time){
        // Divide the time into 2 halves one for hours and other for minutes separated by ':' using substring() method :-
        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));

        int minutesConversion = (hours * 60) + minutes; // hours to minutes conversion.

        return minutesConversion; // return the conversion time, in Integer after converting to minutes.
    }

    public int convertTime(String current, String correct) {
        /*
            Time complexity = O(opsLen), 
            Space complexity = O(1)
        */
        
        int m = current.length(), n = correct.length();
        int currentMinutes = convertToMinutes(current);
        int correctMinutes = convertToMinutes(correct);

        int difference = (correctMinutes - currentMinutes);

        int[] operations = {60, 15, 5, 1}; // greedily search over the operations.
        int opsLen = operations.length;

        int minOps = 0;

        for(int i = 0; i < opsLen; i++){
            int operation = operations[i];
            minOps += (difference / operation);
            difference %= operation;
        }

        return minOps; // Return the minimum number of operations needed to convert current to correct.
    }
}