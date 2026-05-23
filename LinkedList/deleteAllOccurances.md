### Delete all occurrences in a doubly linked list

``` java
/* Structure of Doubly Linked List
class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // code here
        Node temp = head;
        while(temp!= null && temp.data == x){
            temp = temp.next;
        }
        if(temp == null) return null;
        head =temp;
        temp.prev = null;
        while(temp!= null){
            if(temp.data == x){
                Node prev = temp.prev;
                Node next = temp.next;
                
                if(prev != null) prev.next = next;
                if(next != null) next.prev = prev;
            }
            temp= temp.next;
        }
        return head;
    }
}
```
``` javascript
/* a Node of the doubly linked list
class Node {
    constructor(x) {
        this.data = x;
        this.next = null;
        this.prev = null;
    }
}
*/

class Solution {
    // Function to delete a specified node from the linked list
    deleteAllOccurOfX(head, x) {
        // code here
        let temp = head;
        while(temp != null && temp.data == x){
            temp = temp.next;
        }
        if(temp == null) return null;
        temp.prev = null;
        head = temp;
        while(temp != null){
            if(temp.data == x){
                let prev = temp.prev;
                let next = temp.next;
                if(prev != null) prev.next = next;
                if(next != null) next.prev = prev;
            }
            temp = temp.next;
        }
        return head;
    }
}
```