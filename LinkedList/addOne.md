### Add 1 to a Linked List Number

``` java
/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node addOne(Node head) {
        int carry = this.temp(head);
        if(carry == 0) return head;
        Node temp = new Node(carry);
        temp.next = head;
        head = temp;
        return head;
    }
    private int temp(Node head){
        if(head.next == null) {
            int sum = head.data+1;
            head.data = sum%10;
            return (int) sum/10;
        }
        int carry = this.temp(head.next);
        int sum = carry + head.data;
        head.data = sum%10;
        return (int) sum/10;
    }
}
```