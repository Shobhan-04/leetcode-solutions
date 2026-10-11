class Solution:
    def removeZeros(self, n: int) -> int:
        zeros_removal = int(str(n).replace("0", ""))
        return zeros_removal