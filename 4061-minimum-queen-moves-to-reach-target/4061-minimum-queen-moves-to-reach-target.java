class Solution {
    public int minQueenMoves(int[] source, int[] target) {
        /*
            Time complexity = O(1), 
            Space complexity = O(1)
        */
        
        int m = source.length, n = target.length;

        int sr = source[0], sc = source[1];
        int tr = target[0], tc = target[1];

        int minQueenMovesCount = 0;

        if((sr == tr) && (sc == tc)){
            minQueenMovesCount = 0;
        }else if((sr == tr) || (sc == tc)){
            minQueenMovesCount++;
        }else if(Math.abs(sr - tr) == Math.abs(sc - tc)){
            minQueenMovesCount++;
        }else{
            minQueenMovesCount += 2;
        }

        return minQueenMovesCount;
    }
}