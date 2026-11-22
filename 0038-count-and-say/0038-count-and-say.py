class Solution:
    def countAndSay(self, n: int) -> str:
        '''
            Eg. 3322251 -> Two 3's, Three 2's, One 5, One 1. 
                        -> "23"+ "32" + "15" + "11" = "23321511".

            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for result list. 
        '''

        if(n == 1) :
            return "1"
        
        result = []
        say = self.countAndSay(n - 1)
        m = len(say)

        i, count = 0, 1

        while(i < m) :
            if(i + 1 < m and say[i] == say[i + 1]) :
                count += 1
            else :
                result.append(str(count)) # int -> str conversion.
                result.append(str(say[i])) # char -> str conversion.
                count = 1 # Re-initializing the count to 1, for performing the next iteration.

            i += 1
        
        return "".join(result) # For converting the result list into the resulant string.