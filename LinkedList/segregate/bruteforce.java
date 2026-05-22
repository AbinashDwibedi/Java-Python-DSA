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
        int[] num = new int[3];
        while(head!=null){
            num[head.data]++;
            head = head.next;
        }
        Node dummy = new Node(0);
        Node tail = dummy;
        for(int i = 0 ;i<3;i++){
            for(int j =0;j<num[i];j++){
                tail.next = new Node(i);
                tail = tail.next;
            }
        }
        return dummy.next;
    }
}