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
    public ListNode reverseList(ListNode head) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        ListNode prevNode = null, nextNode = null, currNode = head;

        while(currNode != null){ // Iterate until the currNode is not null.
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode; 
        }

        return(prevNode);
    }
}