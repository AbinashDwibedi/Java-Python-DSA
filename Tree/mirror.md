### Mirror Tree
```java
/*
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    void mirror(Node root) {
        this.mirrorT(root);
    }
    private Node mirrorT(Node root){
        if(root == null) return null;
        Node leftNode =this.mirrorT(root.left);
        Node rightNode = this.mirrorT(root.right);
        root.left = rightNode;
        root.right = leftNode;
        return root;
    }
}
```
