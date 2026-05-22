/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        Node zeros = new Node(0);
        Node ones = new Node(0);
        Node twos = new Node(0);
        Node zerosHead = zeros;
        Node onesHead = ones;
        Node twosHead = twos;
        Node dummy = head;
        while(dummy != null){
            if(dummy.data == 0){
                zeros.next = dummy;
                zeros = zeros.next;
            }
            if(dummy.data == 1){
                ones.next = dummy;
                ones = ones.next;
            }
            if(dummy.data == 2){
                twos.next = dummy;
                twos = twos.next;
            }
            dummy = dummy.next;
        }
        zeros.next = onesHead.next != null? onesHead.next : twosHead.next;
        ones.next = twosHead.next;
        twos.next = null;
        return zerosHead.next;
    }
}