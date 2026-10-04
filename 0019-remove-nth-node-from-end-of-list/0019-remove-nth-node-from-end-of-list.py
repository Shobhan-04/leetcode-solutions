# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: ListNode | None, n: int) -> ListNode | None:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        left, right = head, head

        i = 0

        # Move the right pointer n positions ahead :-
        while(i < n) :
            right = right.next
            i += 1
        
        # If right reaches None, then remove the head :-
        if(right is None) :
            return head.next # Delete the head Node

        # Move forward both left and right pointers :-
        while(right.next is not None) : 
            right = right.next
            left = left.next
        
        left.next = left.next.next # Remove the nth node from the end of the list.

        return head