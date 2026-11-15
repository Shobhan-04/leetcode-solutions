class Solution:
    def solve(self, expression: str) -> list[int] :
        n = len(expression)
        result = []

        for i in range(n) : # O(n)
            expression_ch = expression[i]

            if(expression_ch == '-' or expression_ch == '+' or expression_ch == '*') :
                left_result = self.solve(expression[0 : i])
                right_result = self.solve(expression[i + 1 : ])

                for x in left_result :
                    for y in right_result :
                        if(expression_ch == '-') :
                            result.append(x - y)
                        elif(expression_ch == '+') :
                            result.append(x + y)
                        elif(expression_ch == '*') :
                            result.append(x * y)
        
        if(len(result) == 0) :
            result.append(int(expression))

        return result

    def diffWaysToCompute(self, expression: str) -> list[int]:
        '''
            Time complexity = O(n * (2 ^ n)), 
            Space complexity = O(n) -> For the resultant list.
        '''

        result = self.solve(expression)
        return result