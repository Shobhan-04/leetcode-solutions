class Solution {
    public boolean hasAlternatingBits(int n) {
        /*
            Time complexity = O(m), where 'm' represents the length of the binaryNStr. 
            Space complexity = O(1)
        */        
        
        String binaryNStr = Integer.toBinaryString(n); 

        boolean isAlternatingBits = true;

        for(int i = 0; i < binaryNStr.length() - 1; i++){ // O(m)
            char binaryNCh = binaryNStr.charAt(i);
            char binaryNPlusCh = binaryNStr.charAt(i+1);

            if(binaryNCh == binaryNPlusCh) isAlternatingBits = false;
        }

        return isAlternatingBits;
    }
}