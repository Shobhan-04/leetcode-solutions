class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        int[] minutesArr = new int[n];

        // Add the time into minutesArr :-
        for(int i = 0; i < n; i++){
            String timePoint = timePoints.get(i); // extract each timePoints.
            
            // Conversion of substring(0, 2) into integer to calculate the hours :-
            int hours = Integer.parseInt(timePoint.substring(0, 2)); 
           
            // Conversion of substring(3, 5) into integer to calculate the minutes :-
            int minutes = Integer.parseInt(timePoint.substring(3, 5));
            
            int hoursToMinutes = (hours * 60) + minutes; 

            minutesArr[i] = hoursToMinutes;
        }

        Arrays.sort(minutesArr); // Sort the minutesArr.

        int minMinutesDiff = Integer.MAX_VALUE;

        // Calculate the minimum minutes difference :-
        for(int i = 1; i < n; i++){ // 1-indexed iteration
            int minute = minutesArr[i];
            int minutePrev = minutesArr[i - 1];

            // Calculate the difference between the adjacent minutes :-
            int currentMinutesDiff = (minute - minutePrev);

            // Store the minimum of minMinutesDiff and circularMinutesDiff :-
            minMinutesDiff = Math.min(minMinutesDiff, currentMinutesDiff);
        }

        // Calculate the circular difference bcoz, 24 hours = 1440 minutes :-
        int circularMinutesDiff = (1440 - minutesArr[n - 1]) + minutesArr[0];

        // Store the minimum of minMinutesDiff and circularMinutesDiff :-
        minMinutesDiff = Math.min(minMinutesDiff, circularMinutesDiff);

        return minMinutesDiff; // Return minMinutesDiff
    }
}