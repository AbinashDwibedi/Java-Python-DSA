class Node<T>{
    T data;
    Node<T> next;

    public Node(T value) {
        this.data = value;
    }
    
}

public class SinglyLinkedList<T>{
    private Node<T> root;

    public SinglyLinkedList() {
    }
    
    public void insert(T value){
        Node<T> newNode = new Node<>(value);
        if(this.root == null){
            this.root = newNode;
            return;
        }
        Node<T> lastNode = this.root;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }
    public void remove(T value){
        if(this.root == null) return;
        if(this.root.data.equals(value)){
            this.root = this.root.next;
            return;
        }
        Node<T> temp = this.root;
        while(temp.next != null){
            if(temp.next.data.equals(value)){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }

    }

    public void show(){
        Node<T> temp = this.root;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next != null){
                System.err.print(" -> ");
            }
            temp = temp.next;
            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SinglyLinkedList<Integer> ll = new SinglyLinkedList<>();
        ll.insert(234);
        ll.insert(644);
        ll.insert(98234);
        ll.show();
        ll.remove(234);
        ll.show();
        ll.remove(98234);
        ll.show();
    }
}