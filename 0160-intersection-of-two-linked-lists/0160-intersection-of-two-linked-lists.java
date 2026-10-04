/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        /*
            Time complexity = O(n), 
            Space complexity = O(1)
        */
        
        ListNode ptrA = headA, ptrB = headB;
        int countIntersection = 0;

        while(true){
            if(ptrA == ptrB) return ptrA;

            ptrA = ptrA.next;
            ptrB = ptrB.next;

            if(ptrA == null){
                countIntersection++;
                ptrA = headB;
            }

            if(ptrB == null) ptrB = headA;

            if(countIntersection > 1){
                return null;
            }
        }
    }
}