class Solution {
    public int findSecondLargestElem(int[] nums){
        int n = nums.length;
        int largest = -1, secondLargest = -1;

        for(int i = 0; i < n; i++){
            int num = nums[i];

            if(num > largest){
                secondLargest = largest;
                largest = num;
            }
            else if(num > secondLargest && num < largest) secondLargest = num;
        }

        return secondLargest;
    }

    public int secondHighest(String s) {
        /*
            Time complexity = O(n), 
            Space complexity = O(10) = O(1)
        */
        
        int n = s.length();

        int i = 0;
        int[] digitsArr = new int[10];
        boolean[] seenArr = new boolean[10];

        int secondLargestDigit = -1;
        int index = 0;

        while(i < n){
            char sCh = s.charAt(i);
            if(Character.isDigit(sCh)){
                int digit = (sCh - '0');

                if(!seenArr[digit] == true){
                    digitsArr[index++] = digit;
                    seenArr[digit] = true;
                }
            }

            i++;
        } 

        secondLargestDigit = findSecondLargestElem(Arrays.copyOf(digitsArr, index));

        return secondLargestDigit == -1 ? -1 : secondLargestDigit;
    }
}