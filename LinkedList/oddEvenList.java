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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode evenNode = head.next;
        ListNode even = evenNode;
        ListNode odd = head;
        while(evenNode != null && evenNode.next != null){
            odd.next = evenNode.next;
            odd = odd.next;
            evenNode.next = odd.next;
            evenNode = evenNode.next;
        }
        odd.next = even;
        return head;
    }
}