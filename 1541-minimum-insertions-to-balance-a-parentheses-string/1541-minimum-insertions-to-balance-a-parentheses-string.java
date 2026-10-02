class Solution {
    public int minInsertions(String s) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = s.length();
        int i = 0, minimumInsertionsCount = 0;
        int closeBracketsCount = 0, result = 0;

        while(i < n){ // O(n)
            char sCh = s.charAt(i);
           
            if(sCh == '('){ // Check open bracket.
                closeBracketsCount += 2; // 2 close brackets are required
                if(closeBracketsCount % 2 != 0){ // Check whether 2 close brackets satisfies or not.
                    result++; 
                    closeBracketsCount--;
                }
            }else{
                closeBracketsCount -= 1;
                if(closeBracketsCount < 0){
                    result++;
                    closeBracketsCount += 2;
                }
            }
            
            i++;
        }

        minimumInsertionsCount = (result + closeBracketsCount);

        return minimumInsertionsCount;
    }
}