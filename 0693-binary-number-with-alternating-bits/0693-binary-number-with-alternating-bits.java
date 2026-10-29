class Solution {
    public boolean hasAlternatingBits(int n) {
        /*
            Time complexity = O(log(n)), 
            Space complexity = O(1)
        */        
        
        boolean isAlternatingBits = true;
        int currentBit = (n % 2 == 0) ? 1 : 0;

        while(n > 0){ // O(log(n))
            int lastBit = (n % 2);

            if(currentBit == lastBit){
                isAlternatingBits = false;
            }

            currentBit = lastBit;
            n /= 2;
        }

        return isAlternatingBits;
    }
}