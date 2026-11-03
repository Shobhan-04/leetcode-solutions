class Solution {
    public char binarySearch(char[] letters, char target){
        int n = letters.length;
        int left = 0, right = (n - 1);
        char smallestChar = letters[0];

        while(left <= right){
            int mid = left + (right - left) / 2;
            
            if(letters[mid] <= target){
                left = (mid + 1); // Search in the right part of the array.
            }else{
                smallestChar = letters[mid];
                right = (mid - 1); // Search in the left part of the array.
            }
        }

        return smallestChar;
    }

    public char nextGreatestLetter(char[] letters, char target) {
        /*
            Time complexity = O(log(n)), 
            Space complexity = O(1)
        */
        
        return(binarySearch(letters, target));
    }
}