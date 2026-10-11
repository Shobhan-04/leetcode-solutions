class Solution {
    public long removeZeros(long n) {
        String zerosRemoval = String.valueOf(n).replace("0", "");
        return(Long.parseLong(zerosRemoval));
    }
}