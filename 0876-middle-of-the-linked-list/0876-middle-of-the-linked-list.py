# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: ListNode | None) -> ListNode | None:
        '''
            Time complexity = O(1), 
            Space complexity = O(1)
        '''

        slow, fast = head, head 

        while(fast != None and fast.next != None) :
            slow = slow.next 
            fast = fast.next.next
        
        return(slow)