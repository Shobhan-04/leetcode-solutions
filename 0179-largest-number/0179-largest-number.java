class Solution {
    public String largestNumber(int[] nums) {
        /*
            Time complexity = O(nlog(n) * l), where n is the number of elements in the nums array, and l is the average number of digits (length) of the numbers.

            Space complexity = O(n * l)
        */
        
        int n = nums.length;
        String[] s = new String[n];
        String result = "";

        for(int i = 0; i < n; i++){
            int num = nums[i];
            s[i] = String.valueOf(num); // Convert the int back to a String.
        }

        // Custom cmparator for comparing the 2 strings in a string array and sorting it in-place :-
        Arrays.sort(s, (a, b) -> (b + a).compareTo(a + b));

        if(s[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            String val = s[i];
            sb.append(val); // Append the largest number in the array s.
        }

        result = sb.toString(); // Convert StringBuilder back to String.

        return result; // Return the largest number.
    }
}