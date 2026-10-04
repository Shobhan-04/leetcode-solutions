/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        ListNode left = head, right = head;

        int i = 0;

        // Move the right pointer n times forward :-
        while(i < n){ 
            right = right.next;
            i++;
        }

        // If right is null, then remove the head :-
        if(right == null){
            return head.next;
        }

        // Move both the right and left pointers forward :-
        while(right.next != null){
            right = right.next;
            left = left.next;
        }

        // Remove the nth node from the end of the list :-
        left.next = left.next.next;

        return(head);
    }
}