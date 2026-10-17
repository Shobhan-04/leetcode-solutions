import java.time.LocalDate;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] daysInWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Create a LocalDate obect using the parameters as year, month, and day :-
        LocalDate date = LocalDate.of(year, month, day);

        // Get the day of the week value :-
        int dayValue = date.getDayOfWeek().getValue();

        // Convert the dayValue to be within the range of 0-6, where 0 -> "Sunday" and 6 -> "Saturday", by modulo 7 :-
        int arrayIndex = (dayValue % 7);

        // Extract the particular day in the week from arrayIndex and store it in the variable named dayOfWeek :-
        String dayOfWeek = daysInWeek[arrayIndex];

        return(dayOfWeek); // Return the particular day of the week.
    }
}