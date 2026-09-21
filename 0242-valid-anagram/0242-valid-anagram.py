class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s_len, t_len = len(s), len(t)

        freq_s = dict()

        if s_len != t_len :
            return False

        for s_ch in s :
            if s_ch not in freq_s :
                freq_s[s_ch] = 1
            else :
                freq_s[s_ch] += 1
        
        for t_ch in t :
            if t_ch not in freq_s :
                freq_s[t_ch] = 1
            else :
                freq_s[t_ch] -= 1

        for val in freq_s.values() :
            if val != 0 :
                return False
        return True