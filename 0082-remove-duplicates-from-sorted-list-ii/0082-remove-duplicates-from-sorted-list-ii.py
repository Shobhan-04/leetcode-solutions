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
        
        # If ListNode contains only one element :-
        if(head is None or head.next is None) : # Base condition
            return(head) # return the head element itself.

        current = head # current points to the head.
        prev = None # prev points to None value.
        
        # Check until, current and current's next value is not None :- 
        while(current is not None and current.next is not None) : 
            if(current.next.val == current.val) : # Duplicate encountered
                duplicate_value = current.val # current value is the duplicate value.
        
                # Check until, current is not None and the current value is equals to the duplicate value :-
                while(current is not None and current.val == duplicate_value) : 
                    current = current.next # move the current element forward.
            
                if(prev is None) : # check wheher prev is None
                    head = current # store the current value into the head .
                else :
                    prev.next = current # store the current value in the previous's next value.

            else : # No dulicates encountered :-
                prev = current # Update prev
                current = current.next # Update current
            
        return(head) # leaving only distinct numbers from the original list. Return the linked list in sorted order.