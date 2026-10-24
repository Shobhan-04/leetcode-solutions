class Solution {
    public int getDays(String date, int[] days){
        int n = days.length;
        int month = Integer.parseInt(date.substring(0, 2)); // extract the month from date
        int day = Integer.parseInt(date.substring(3, 5)); // extract the day from date.

        int prevMonth = (month - 1);

        for(int i = 0; i < prevMonth; i++){ // Iterate upto the previous month as per date
            day += days[i]; // Sum of days upto the previous month.
        }

        return day; // return the sum of days upto the previus month.
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        /*
            Example :-
                Input: arriveAlice = "08-15", leaveAlice = "08-18", arriveBob = "08-16", leaveBob = "08-19"
                Output: 3
            
            Time complexity = O(1), 
            Space complexity = O(1)
        */
        
        int[] daysPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int daysTogetherCount = 0;
       
        int a1 = getDays(arriveAlice, daysPerMonth); // get no. of days spent in a year upto the Alice arrival day. -> 227
        int a2 = getDays(arriveBob, daysPerMonth); // get no. of days spent in a year upto the Bob arrival day. -> 228
        int b1 = getDays(leaveAlice, daysPerMonth); // get no. of days spent in a year upto the Alice leave day. -> 230
        int b2 = getDays(leaveBob, daysPerMonth); // get no. of days spent in a year upto the Bob leave day. -> 231

        int startDay = Math.max(a1, a2); // max(227, 228) = 228
        int endDay = Math.min(b1, b2); // min(230, 231) = 230

        daysTogetherCount = (endDay - startDay + 1); // (230 - 228 + 1) = 3 (Output)

        return(Math.max(0, daysTogetherCount)); // Return the total number of days that Alice and Bob are in Rome together.
    }
}