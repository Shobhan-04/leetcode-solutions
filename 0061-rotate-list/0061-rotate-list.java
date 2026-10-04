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
    public ListNode rotateRight(ListNode head, int k) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        if(head == null || head.next == null) return(head);

        ListNode lastNode = head;
        int length = 1;

        while(lastNode.next != null){
            lastNode = lastNode.next;
            length++;
        }

        ListNode currNode = head;
        int i = 0;
        
        k = (k % length);

        if(k == 0) return(head);

        while(i < (length - k - 1)){
            currNode = currNode.next;
            i++;
        }

        lastNode.next = head;
        head = currNode.next;
        currNode.next = null;

        return(head);
    }
}