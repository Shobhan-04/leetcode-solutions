class Solution {
    public int countSegments(String s) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int i = 0, n = s.length();

        int noOfSegments = 0; // Initialize the segment count to 0.

        while(i < n){ // O(n)
            char sCh = s.charAt(i); // Traverse each character in the string.
            
            // Whenever we find a non-space character, check the character immediately before it in the inner loop :
            if(sCh != ' '){ // A segment is defined to be a contiguous sequence of non-space characters.

                // if it is the first character or the previous character is a space :-
                if(i == 0 || s.charAt(i-1) == ' ') noOfSegments++; // Increment the count only when a new segment starts.
            }

            i++;
        }

        return noOfSegments; // return the number of segments in the string.
    }
}