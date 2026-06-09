### kth smallest node in bst
```java
/*
Definition for Node
class Node {
    int data;
    Node left, right;

    public Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/
import java.util.*;
class Solution {
    int result = -1;
    int k;
    public int kthSmallest(Node root, int k) {
        this.k = k;
        inorder(root);
        return this.result;
    }
    private void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        this.k --;
        if(k == 0) {
            result = root.data;
            return;
        }
        inorder(root.right);
    }
}
```
