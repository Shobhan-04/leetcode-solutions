# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: ListNode | None) -> ListNode | None:
        length = 0
        current = head 

        while(current != None) : 
            current = current.next 
            length += 1
        
        i = 0
        current = head 
        mid = (length // 2)

        while(i < mid) : # O(n/2) = O(n)
            current = current.next 
            i += 1
        
        return(current)