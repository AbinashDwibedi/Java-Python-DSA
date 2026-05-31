### maximum diameter of a tree
```java
/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Solution {
    private int diameter;
    public int diameter(Node root) {
        trav(root);
        return diameter;
    }
    private int trav(Node root){
        if(root == null) return 0;
        int left_val = trav(root.left);
        int right_val = trav(root.right);
        
        diameter = Math.max(diameter, left_val+right_val);
        return 1 + Math.max(left_val,right_val);
    }
}
```
