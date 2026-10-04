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
    public boolean isPalindrome(ListNode head) {
        /*
            Time complexity = O(n) 
            Space complexity = O(1)
        */
        
        // If only one element exists in the ListNode :-
        if(head == null || head.next == null) return(true);

        ListNode slow = head, fast = head; // Both slow and fast pointer points to head.

        // Check until fast is not null and fast's next element is not null :-
        while(fast != null && fast.next != null){
            slow = slow.next; // Move the slow pointer by 1 unit.
            fast = fast.next.next; // Move the fast pointer by 2 units.
        }

        ListNode prevNode = null, nextNode = null, currNode = slow;

        // Reverse the Linked List :-
        while(currNode != null){
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        // Initailize the original poiniting to the first index of the head and reversed pointing to the prevNode
        ListNode original = head, reversed = prevNode;

        // Compare original first half of list with the reversed second half of the list :
        while(reversed != null){
            if(original.val != reversed.val){ 
                return(false); // Not palindrome.
            }

            original = original.next; // Move forward.
            reversed = reversed.next; // Move forward
        }

        return(true); // It is a palindrome.
    }
}