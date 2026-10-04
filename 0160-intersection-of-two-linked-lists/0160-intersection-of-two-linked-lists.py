# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        ptr_A, ptr_B = headA, headB
        intersections_count = 0

        while(True) :
            if(ptr_A == ptr_B) :
                return(ptr_A) # return ptr_B

            ptr_A = ptr_A.next
            ptr_B = ptr_B.next

            if(ptr_A is None) :
                intersections_count += 1
                ptr_A = headB
            
            if(ptr_B is None):
                ptr_B = headA

            if(intersections_count > 1) : 
                return(None)
