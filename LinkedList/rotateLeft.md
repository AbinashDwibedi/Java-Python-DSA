### Rotate a Linked List
``` java
/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        if(head.next == null || k == 0) return head;
        int n = 1;
        Node temp = head;
        while(temp.next!=null){
            n++;
            temp = temp.next;
        }
        
        k = k % n;
        int goalNode = k;
        temp.next = head;
        for(int i = 0; i < goalNode;i++){
            temp = temp.next;
        }
        Node newHead = temp.next;
        temp.next = null;
        
        return newHead;
        
        
        
        
        
       
        
    }
}
```
