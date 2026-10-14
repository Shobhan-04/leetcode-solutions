class Solution:
    def countGoodRectangles(self, rectangles: List[List[int]]) -> int:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        n = len(rectangles)
        max_len, rectangles_count = 0, 0

        i = 0

        while(i < n) : 
            length = rectangles[i][0]
            breadth = rectangles[i][1]

            square_side = min(length, breadth)

            if(square_side > max_len) :
                max_len = square_side
                rectangles_count = 1
            elif(square_side == max_len) : 
                rectangles_count += 1

            i += 1

        return rectangles_count 