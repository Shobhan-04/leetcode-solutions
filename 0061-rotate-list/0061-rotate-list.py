# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def rotateRight(self, head: ListNode | None, k: int) -> ListNode | None:
        '''
            Time complexity = O(n)
            Space complexity = O(1)
        '''

        if(head is None or head.next is None) : # Base condition
            return(head)

        last_node = head
        length = 1

        while(last_node.next is not None) :
            last_node = last_node.next
            length += 1

        k = (k % length) 

        if(k == 0) : 
            return(head)
        
        curr_node = head
        i = 0

        while(i < (length - k - 1)) :
            curr_node = curr_node.next
            i += 1 
        
        last_node.next = head
        head = curr_node.next
        curr_node.next = None 

        return(head)