### 
``` java
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
        if(head == null || head.next == null) return null;
        // detecting the cycle
        // ListNode fast = head;
        // ListNode slow = head;
        // while(fast != null && fast.next != null){
        //     fast = fast.next.next;
        //     slow = slow.next;
        //     if(fast == slow) break;
        // }
        // if(fast!= slow) return null;
        // // finding the node
        // slow = head;
        // while(slow!= fast ){
        //     slow = slow.next;
        //     fast = fast.next;
        // }
        // return slow;
        Set<ListNode> st = new HashSet<>();
        ListNode temp = head;
        while(temp!=null){
            if(st.contains(temp)){
                return temp;
            }
            st.add(temp);
            temp = temp.next;
        }
        return null;
    }
}
```