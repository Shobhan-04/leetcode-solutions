# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: ListNode | None) -> ListNode | None:

        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        if(head is None or head.next is None) : # Check whether, there exists only one node, 
            return(head) # then return head.

        current = head # Store head in current.
        
        while(current is not None and current.next is not None) : 
            if(current.next.val == current.val) : # Duplicates encountered
                current.next = current.next.next # Exclude the next element as, the duplicate is encountered.
            else : # No duplicates
                current = current.next # then, next element is the non-duplucate element.
        
        return(head) # Return the linked list in sorted order.