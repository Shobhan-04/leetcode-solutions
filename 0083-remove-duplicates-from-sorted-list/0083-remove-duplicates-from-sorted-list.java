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
    public ListNode deleteDuplicates(ListNode head) {
        /*
            Time complexity = O(n)
            Space complexity = O(1)
        */

        // If the ListNode contains only one element :-
        if(head == null || head.next == null){ // Base condition
            return(head); // then, return that element only.
        }

        ListNode current = head; // Store head in current.

        while(current != null && current.next != null){
            if(current.next.val == current.val){ // Duplicates encountered.
                current.next = current.next.next; // Exclude the next element as, the duplicate is encountered.
            }else{ // No duplicates encountered
                current = current.next; // next element is the non-duplicate element.
            }
        }

        return(head); // Return the LinkedList in sorted order.
    }
}