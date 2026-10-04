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
            Time complexity = O(n), 
            Space complexity = O(1)
        */

        // If ListNode contains only one element :-
        if(head == null || head.next == null){ // Base condition
            return(head); // Return the next element itself
        }

        // currNode points to the head and prevNode points to the null value :-
        ListNode currNode = head, prevNode = null;
        int duplicateValue = 0;

        // Check until, current and current's next value is not None :- 
        while(currNode != null && currNode.next != null){
            if(currNode.next.val == currNode.val){ // Duplicate encountered
                duplicateValue = currNode.val; // curNode value is the duplicate value.
               
                // Check until, current is not None and the current value is equals to the duplicate value :-
                while(currNode != null && currNode.val == duplicateValue){
                    currNode = currNode.next; // Move the currNode to the next element.
                }

                // check wheher prev is None, store the current value into the head :-
                if(prevNode == null) head = currNode;

                // store the current value in the previous's next value :-
                else  prevNode.next = currNode;

            }else{ // No duplicates encountered :-
                prevNode = currNode; // update prevNode.
                currNode = currNode.next; // update currNode.
            }
        }

        return(head); // leaving only distinct numbers from the original list. Return the linked list in sorted order.
    }
}