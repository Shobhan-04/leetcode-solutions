class Solution {
    public int scoreOfParentheses(String s) {
        int n = s.length();
        int score = 0;
        int[] arr = new int[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            char sCh = s.charAt(i);

            if (sCh == '(') {
                arr[++top] = score;
                score = 0;
            } else {
                int prevScore = arr[top--];

                if (s.charAt(i - 1) == '(') {
                    score = prevScore + 1;
                } else {
                    score = prevScore + 2 * score;
                }
            }
        }

        return score;
    }
}