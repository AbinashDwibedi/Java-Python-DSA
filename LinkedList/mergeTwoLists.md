### Merge Two Sorted Lists
``` java
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode nd1 = list1;
        ListNode nd2 = list2;
        ListNode res = new ListNode(0);
        ListNode tail = res;
        while(nd1 != null && nd2 !=null){
            if(nd1.val >= nd2.val){
                tail.next = new ListNode(nd2.val);
                nd2 = nd2.next;
            }
            else{
                tail.next = new ListNode(nd1.val);
                nd1 = nd1.next;
            }
            tail = tail.next;
        }
        while(nd1 != null) {
            tail.next = new ListNode(nd1.val);
            tail = tail.next;
            nd1 = nd1.next;
        }
        while(nd2 != null){
            tail.next = new ListNode(nd2.val);
            tail = tail.next;
            nd2 = nd2.next;
        }

        return res.next;
    }
}
```
