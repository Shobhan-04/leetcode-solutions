class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        n = len(s)
        result = 0

        left, right = 0, 0
        unique_set = set()

        while(right < n) :
            if s[right] not in unique_set :
                unique_set.add(s[right])
                result = max(result, right - left + 1)
                right += 1
            else :
                unique_set.remove(s[left])
                left += 1

        return result
