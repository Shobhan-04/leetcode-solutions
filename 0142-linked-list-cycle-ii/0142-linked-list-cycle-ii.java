/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode detectCycle(ListNode head) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        ListNode slow = head, fast = head;
        boolean containsCycle = false;

        // Check whether the cycle exists using Floyd Warshall's Algorithm :-
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                containsCycle = true;
                break;
            }
        }

        // No cycle :-
        while(fast == null || fast.next == null){
            return(null);
        }

        // Check whether the cycle exists at the beginning of the list :-
        
        slow = head;

        while(slow != fast){ // Cycle entry approach
            slow = slow.next;
            fast = fast.next;
        }

        return(slow);
    }
}