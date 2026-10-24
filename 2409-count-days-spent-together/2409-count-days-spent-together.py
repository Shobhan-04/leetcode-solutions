class Solution:
    def getDays(self, date: str, days: list[int]) -> int:
        n = len(days)
        month = int(date[0:2]) # extract the month from date.
        day = int(date[3:5]) # extract the day from date.

        prev_month = (month - 1)

        for i in range(prev_month) : #  Iterate upto the previous month as per date
            day += days[i] # Sum of days upto the previous month.
        
        return day # return sum of days upto the previous month.

    def countDaysTogether(self, arriveAlice: str, leaveAlice: str, arriveBob: str, leaveBob: str) -> int:
        '''
            Example :-
                Input: arriveAlice = "08-15", leaveAlice = "08-18", arriveBob = "08-16", leaveBob = "08-19"
                Output: 3
            
            Time complexity = O(1), 
            Space complexity = O(1)
        '''

        days_per_month = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
        days_together_count = 0

        aA = self.getDays(arriveAlice, days_per_month) # get no. of days spent in a year upto the Alice arrival day. -> 227
        aB = self.getDays(arriveBob, days_per_month) # get no. of days spent in a year upto the Bob arrival day. -> 228
        lA = self.getDays(leaveAlice, days_per_month) # get no. of days spent in a year upto the Alice leave day. -> 230
        lB = self.getDays(leaveBob, days_per_month) # get no. of days spent in a year upto the Bob leave day. -> 231

        start_day = max(aA, aB) # max(227, 228) = 228
        end_day = min(lA, lB) # min(230, 231) = 230

        days_together_count = (end_day - start_day + 1) # (230 - 228 + 1) = 3 (Output)

        return(max(0, days_together_count)) # Return the total number of days that Alice and Bob are in Rome together.