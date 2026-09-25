class Solution {
    public String convertToTitle(int columnNumber) {
        /*
            Time Complexity = O(log_26(columnNumber)), 
            Space Complexity = O(n)
        */

        StringBuilder result = new StringBuilder();
        String columnTitle = "";

        while(columnNumber > 0){
            // Adjust for 1-based indexing of Excel columns
            columnNumber--;

            int remainder = (columnNumber % 26);

            char ch = (char) (remainder + 'A');
            result.append(ch);

            columnNumber /= 26;
        }

        columnTitle = result.reverse().toString();
        return columnTitle;
    }
}