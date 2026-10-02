class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1) -> Assuming, the resultant array takes O(1) space.
        */
        
        int n = seq.length();
        int i = 0, maxNestingDepth = Integer.MIN_VALUE;
        int[] answer = new int[n];

        while(i < n){ // O(n)
            char seqCh = seq.charAt(i);

            if(seqCh == '('){ // Bracket starts
                maxNestingDepth++;
                answer[i] = (maxNestingDepth % 2 == 0) ? 0 : 1; 
            }else{ // Bracket ends
                answer[i] = (maxNestingDepth % 2 == 0) ? 0 : 1;
                maxNestingDepth--;
            }

            i++;
        }

        return answer;
    }
}