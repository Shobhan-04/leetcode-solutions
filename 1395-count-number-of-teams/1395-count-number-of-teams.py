class Solution:
    def numTeams(self, rating: list[int]) -> int:
        '''
            Time complexity = O(n^2)
            Space complexity = O(1)
        '''

        n = len(rating)
        no_of_teams = 0

        for i in range(n):
            left_smaller, left_greater = 0, 0
            right_smaller, right_greater = 0, 0

            for j in range(i):
                if rating[j] < rating[i]:
                    left_smaller += 1
                elif rating[j] > rating[i]:
                    left_greater += 1

            for k in range(i + 1, n):
                if rating[k] > rating[i]:
                    right_greater += 1
                elif rating[k] < rating[i]:
                    right_smaller += 1

            no_of_teams += (
                left_smaller * right_greater
                + left_greater * right_smaller
            )

        return no_of_teams