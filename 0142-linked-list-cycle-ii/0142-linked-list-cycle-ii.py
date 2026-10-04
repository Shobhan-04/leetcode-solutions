# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        '''
            Time complexity = O(n), 
            Space complexity = O(1)
        '''

        slow, fast = head, head

        # Cycle detection using Floyd Warshall's Algorithm :-
        while(fast is not None and fast.next is not None) :
            slow = slow.next
            fast = fast.next.next

            if(slow == fast) :
                break
            
        # No cycle exists :-
        while(fast is None or fast.next is None) :
            return None
        
        # Cycle exists at the beginning of the list :-
        
        slow = head

        while(slow != fast) :
            slow = slow.next
            fast = fast.next
        
        return(slow)

