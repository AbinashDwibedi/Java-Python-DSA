### Height of Binary Tree 
```java
/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root) {
        return trav(root) -1;
    }
    private int trav(Node root){
        if(root == null) return 0;
        return 1 +Math.max(this.trav(root.left),this.trav(root.right));
        
    }
}
```
