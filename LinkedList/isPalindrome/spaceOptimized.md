### 
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
    public boolean isPalindrome(ListNode head) {
        // ListNode temp = head;
        // ArrayList<Integer> list = new ArrayList<>();

        // while(temp != null){
        //     list.add(temp.val);
        //     temp = temp.next;
        // }
        // int n = list.size();
        // for(int i =0;i<n/2;i++){
        //     if(list.get(i) != list.get((n-1)-i)){
        //         return false;
        //     }
        // }
        // return true;

        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode reversedNode = this.reverseList(slow);
        ListNode startingNode = head;
        while(reversedNode != null ){
            if(startingNode.val != reversedNode.val){
                return false;
            }
            startingNode = startingNode.next;
            reversedNode = reversedNode.next;
        }
        return true;

    }
    private ListNode reverseList(ListNode node){
        ListNode prev = null;
        ListNode curr = node;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
```