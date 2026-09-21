class Solution:
    def sortString(self, s) :
        lst = list(s) # convert string to list
        lst.sort() # sort he list
        return "".join(lst) # join the list to form the string.

    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        dict1 = dict()

        for s in strs :
            key = self.sortString(s)

            if key in dict1 :
                dict1[key].append(s)
            else :
                dict1[key] = [s]
        
        return list(dict1.values())
