class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int m = rectangles.length, n = rectangles[0].length;

        int i = 0;
        int maxLen = 0, rectanglesCount = 0;
        
        while(i < m){
            int length = rectangles[i][0];
            int breadth = rectangles[i][1];

            int squareSide = Math.min(length, breadth);

            if(squareSide > maxLen){
                maxLen = squareSide;
                rectanglesCount = 1;
            }else if(squareSide == maxLen){
                rectanglesCount++;
            }

            i++;
        }

        return rectanglesCount;
    }
}