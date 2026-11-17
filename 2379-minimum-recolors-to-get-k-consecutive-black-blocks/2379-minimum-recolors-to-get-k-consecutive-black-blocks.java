class Solution {
    public int minimumRecolors(String blocks, int k) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        int n = blocks.length();
        int consecutiveWhiteBlocksCount = 0;

        int i = 0;

        while(i < k){
            char blocksCh = blocks.charAt(i);
            if(blocksCh == 'W') consecutiveWhiteBlocksCount++;

            i++;
        }

        i = k;
        int minRecolorsOps = consecutiveWhiteBlocksCount;

        while(i < n){
            char blocksCh = blocks.charAt(i), blocksPrevCh = blocks.charAt(i-k);

            if(blocksCh == 'W') consecutiveWhiteBlocksCount++;
            if(blocksPrevCh == 'W') consecutiveWhiteBlocksCount--;

            minRecolorsOps = Math.min(minRecolorsOps, consecutiveWhiteBlocksCount);
            
            i++;
        }

        return(minRecolorsOps);
    }
}