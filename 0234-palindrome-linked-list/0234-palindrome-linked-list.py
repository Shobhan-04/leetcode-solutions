# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: ListNode | None) -> bool:
        '''
            Time complexity = O(n) 
            Space complexity = O(1)
        '''

        if(head == None or head.next == None) : # Base condition
            return(True) # Return True, if LL contains only one element.
        
        slow, fast = head, head

        while(fast is not None and fast.next is not None) :
            slow = slow.next 
            fast = fast.next.next
        
        prev_node, curr_node, next_node = None, slow, None

        # Reverse the Linked List :-
        while(curr_node != None) : 
            next_node = curr_node.next
            curr_node.next = prev_node
            prev_node = curr_node
            curr_node = next_node
        
        original, reversed = head, prev_node

        # Compare the first half of the original Linked List with the second half of the reversed Linked List :-
        while(reversed is not None) :
            if(original.val != reversed.val) : 
                return(False) # Not a palindrome Linked List.
            
            original = original.next
            reversed = reversed.next
        
        return(True) # It is a palindrome Linked List.